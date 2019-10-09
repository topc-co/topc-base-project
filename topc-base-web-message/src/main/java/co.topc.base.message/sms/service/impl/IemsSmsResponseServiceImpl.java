package co.topc.base.message.sms.service.impl;

import co.topc.base.message.sms.entity.IemsSmsResponse;
import co.topc.base.message.sms.mapper.IemsSmsResponseMapper;
import co.topc.base.message.sms.service.IemsSmsResponseService;
import co.topc.base.message.sms.util.CommonResponseUtil;
import co.topc.web.commons.constants.TopcStringConstant;
import co.topc.web.commons.utils.TopcUUIDUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author fantao
 * @date 2019/9/15 23:09
 */
@Service
@Primary
public class IemsSmsResponseServiceImpl implements IemsSmsResponseService {

    @Autowired
    private IemsSmsResponseMapper iemsSmsResponseMapper;

    @Override
    public void addIemsSmsResponse(CommonResponse commonResponse) {
        IemsSmsResponse iemsSmsResponse = new IemsSmsResponse();
        iemsSmsResponse.setPkId(TopcUUIDUtils.getUUIDWithoutDash());

        String data = commonResponse.getData();
        iemsSmsResponse.setResponse(data);

        JSONObject dataJson = JSONObject.parseObject(data);

        iemsSmsResponse.setCode(dataJson.getString("Code"));
        iemsSmsResponse.setMessage(dataJson.getString("Message"));
        iemsSmsResponse.setRequestId(dataJson.getString("RequestId"));
        iemsSmsResponse.setBizid(dataJson.getString("BizId"));

//        JSONObject smsSendDetailDTOs = dataJson.getJSONObject("SmsSendDetailDTOs");
//        JSONArray smsSendDetailDTO = smsSendDetailDTOs.getJSONArray("SmsSendDetailDTO");
//        if (null != smsSendDetailDTO && smsSendDetailDTO.size() > 0) {
//            for (Object object : smsSendDetailDTO) {
//                // 暂时是单条发送, 后期根据情况改造
//                JSONObject smsSendDetail = JSONObject.parseObject(JSON.toJSONString(object));
//                iemsSmsResponse.setOutId(smsSendDetail.getString("OutId"));
//                break;
//            }
//        }


        iemsSmsResponse.setCreateBy("system");
        iemsSmsResponse.setCreateDate(new Date());
        iemsSmsResponse.setUpdateBy("system");
        iemsSmsResponse.setUpdateDate(new Date());
        iemsSmsResponse.setIsDeleted(TopcStringConstant.N.toUpperCase());

        iemsSmsResponseMapper.insertSelective(iemsSmsResponse);
    }
}
