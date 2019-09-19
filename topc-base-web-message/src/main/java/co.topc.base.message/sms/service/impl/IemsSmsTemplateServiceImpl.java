package co.topc.base.message.sms.service.impl;

import co.topc.base.message.sms.entity.IemsSmsTemplate;
import co.topc.base.message.sms.entity.IemsSmsTemplateExample;
import co.topc.base.message.sms.mapper.IemsSmsTemplateMapper;
import co.topc.base.message.sms.service.IemsSmsTemplateService;
import co.topc.web.commons.constants.TopcStringConstant;
import co.topc.web.commons.utils.TopcCollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fantao
 * @date 2019/9/15 18:45
 */
@Service
@Primary
public class IemsSmsTemplateServiceImpl implements IemsSmsTemplateService {

    @Autowired
    private IemsSmsTemplateMapper iemsSmsTemplateMapper;

    @Override
    public IemsSmsTemplate findByTemplateCode(String templateCode) {
        IemsSmsTemplateExample iemsSmsTemplateExample = new IemsSmsTemplateExample();
        IemsSmsTemplateExample.Criteria criteria = iemsSmsTemplateExample.createCriteria();
        criteria.andTemplateCodeEqualTo(templateCode);
        criteria.andIsDeletedEqualTo(TopcStringConstant.N.toUpperCase());

        List<IemsSmsTemplate> iemsSmsTemplates = iemsSmsTemplateMapper.selectByExample(iemsSmsTemplateExample);


        return TopcCollectionUtils.isEmpty(iemsSmsTemplates) ? null : iemsSmsTemplates.get(0);
    }
}
