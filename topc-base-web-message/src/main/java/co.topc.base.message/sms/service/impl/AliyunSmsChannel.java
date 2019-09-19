package co.topc.base.message.sms.service.impl;

import co.topc.base.message.sms.entity.req.SendSmsReq;
import co.topc.base.message.sms.service.ISmsChannel;
import com.alibaba.fastjson.JSON;
import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 阿里云发送短信接口实现
 *
 * @author fantao
 * @date 2019/9/11 22:17
 */
@Service("aliyunSmsChannel")
@Primary
public class AliyunSmsChannel implements ISmsChannel {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${sms.accessKeyId}")
    private String accessKeyId;

    @Value("${sms.accessSecret}")
    private String accessSecret;

    @Value("${sms.isSend}")
    private boolean isSend;

    @Value("${sms.signName}")
    private String signName;

    @Override
    @Async
    public CommonResponse send(SendSmsReq sendSmsReq) throws ClientException {
        logger.info("阿里云发送短信接口入参{}", JSON.toJSONString(sendSmsReq));
        if (!isSend) {
            logger.info("短信发送开关处于关闭状态！！！");
            return null;
        }
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou",
                accessKeyId, accessSecret);
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.setVersion("2017-05-25");

        request.putQueryParameter("PhoneNumbers", sendSmsReq.getPhoneNumber());
        request.putQueryParameter("SignName", sendSmsReq.getSignName());
        request.putQueryParameter("TemplateCode", sendSmsReq.getTemplateCode());
        request.putQueryParameter("TemplateParam", sendSmsReq.getTemplateParam());
        request.putQueryParameter("OutId", sendSmsReq.getOutId());

        try {
            logger.info("阿里云发送短信接口request{}", JSON.toJSONString(request));
            CommonResponse response = client.getCommonResponse(request);
            logger.info("阿里云发送短信接口response{}", JSON.toJSONString(response));
            return response;
        } catch (ServerException e) {
            logger.error("阿里云发送短信ServerException", e);
            throw e;
        } catch (ClientException e) {
            logger.error("阿里云发送短信ClientException", e);
            throw e;
        }
    }
}
