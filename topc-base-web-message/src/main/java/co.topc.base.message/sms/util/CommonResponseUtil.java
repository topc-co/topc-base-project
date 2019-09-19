package co.topc.base.message.sms.util;

import co.topc.web.commons.utils.TopcStringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.CommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * 处理发送消息响应报文工具类
 *
 * @author fantao
 * @date 2019/9/15 23:40
 */
public class CommonResponseUtil {

    private static final String OK = "OK";
    private static final String CODE = "Code";

    /**
     * 判断是否成功响应
     *
     * @param commonResponse
     * @return
     */
    public static Boolean isSuccess(CommonResponse commonResponse) {
        if (null == commonResponse) {
            return Boolean.FALSE;
        }
        String data = commonResponse.getData();
        JSONObject jsonObject = JSONObject.parseObject(data);
        if (OK.equals(jsonObject.getString(CODE))) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    /**
     * 获取key对应的值(支持多个key)
     *
     * @param keys
     * @param commonResponse
     * @return
     */
    public static JSONObject get(String[] keys, CommonResponse commonResponse) {
        JSONObject data = JSONObject.parseObject(commonResponse.getData());
        if (null == keys || keys.length == 0) {
            return data;
        }

        JSONObject result = new JSONObject(5);
        for (String key : keys) {
            result.put(key, data.getString(key));
        }
        return result;
    }

    /**
     * 获取key对应的值
     *
     * @param key
     * @param commonResponse
     * @return
     */
    public static String get(String key, CommonResponse commonResponse) {
        if (TopcStringUtils.isBlank(key)) {
            return commonResponse.getData();
        } else {
            JSONObject data = JSONObject.parseObject(commonResponse.getData());
            return data.getString(key);
        }
    }

    /**
     * 获取SmsSendDetail
     *
     * @param commonResponse
     * @return
     */
    public static JSONArray getSmsSendDetailDTOList(CommonResponse commonResponse) {
        if (null == commonResponse) {
            return null;
        }

        JSONObject jsonObject = JSONObject.parseObject(commonResponse.getData());
        JSONObject smsSendDetailDTOs = jsonObject.getJSONObject("SmsSendDetailDTOs");
        if (null != smsSendDetailDTOs) {
            return smsSendDetailDTOs.getJSONArray("SmsSendDetailDTO");
        } else {
            return null;
        }
    }

    /**
     * 获取outIda
     *
     * @param commonResponse
     * @return
     */
    public static List<String> getOutId(CommonResponse commonResponse){
        JSONArray smsSendDetailList = getSmsSendDetailDTOList(commonResponse);
        List<String> outIdList = new ArrayList<>(1);
        if (null != smsSendDetailList && smsSendDetailList.size() > 0) {
            for (Object object : smsSendDetailList) {
                JSONObject smsSendDetail = JSONObject.parseObject(JSON.toJSONString(object));
                String outId = smsSendDetail.getString("OutId");
                outIdList.add(outId);
            }
        }
        return outIdList;
    }
}
