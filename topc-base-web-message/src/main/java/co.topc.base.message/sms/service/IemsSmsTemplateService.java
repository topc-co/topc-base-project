package co.topc.base.message.sms.service;

import co.topc.base.message.sms.entity.IemsSmsTemplate;

/**
 * @author fantao
 * @date 2019/9/15 18:45
 */
public interface IemsSmsTemplateService {

    /**
     * 根据短信模板ID查询短信模板信息
     *
     * @param templateCode 短信模板ID
     * @return
     */
    IemsSmsTemplate findByTemplateCode(String templateCode);
}
