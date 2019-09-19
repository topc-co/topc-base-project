package co.topc.base.message.sms.service.impl;

import co.topc.base.message.sms.entity.IemsSmsSendRecord;
import co.topc.base.message.sms.entity.IemsSmsSendRecordExample;
import co.topc.base.message.sms.entity.req.SendSmsReq;
import co.topc.base.message.sms.mapper.IemsSmsSendRecordMapper;
import co.topc.base.message.sms.service.IemsSmsSendRecordService;
import co.topc.web.commons.constants.TopcStringConstant;
import co.topc.web.commons.utils.TopcCollectionUtils;
import co.topc.web.commons.utils.TopcUUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author fantao
 * @date 2019/9/15 18:46
 */
@Service
@Primary
public class IemsSmsSendRecordServiceImpl implements IemsSmsSendRecordService {

    @Autowired
    private IemsSmsSendRecordMapper iemsSmsSendRecordMapper;

    @Override
    public IemsSmsSendRecord findByPhoneNumber(String phoneNumber) {

        IemsSmsSendRecordExample iemsSmsSendRecordExample = new IemsSmsSendRecordExample();
        IemsSmsSendRecordExample.Criteria criteria = iemsSmsSendRecordExample.createCriteria();
        criteria.andPhoneNumberEqualTo(phoneNumber);
        criteria.andIsDeletedEqualTo(TopcStringConstant.N.toUpperCase());

        iemsSmsSendRecordExample.setOrderByClause("create_date desc");

        List<IemsSmsSendRecord> iemsSmsSendRecords = iemsSmsSendRecordMapper.selectByExample(iemsSmsSendRecordExample);

        return TopcCollectionUtils.isEmpty(iemsSmsSendRecords) ? null : iemsSmsSendRecords.get(0);
    }

    @Override
    public void addIemsSmsSendRecord(SendSmsReq sendSmsReq) {
        IemsSmsSendRecord iemsSmsSendRecordNew = new IemsSmsSendRecord();
        iemsSmsSendRecordNew.setPhoneNumber(sendSmsReq.getPhoneNumber());
        iemsSmsSendRecordNew.setSignName(sendSmsReq.getSignName());
        iemsSmsSendRecordNew.setOutId(TopcUUIDUtils.getUUIDWithoutDash());
        iemsSmsSendRecordNew.setTemplateCode(sendSmsReq.getTemplateCode());
        iemsSmsSendRecordNew.setTemplateName(sendSmsReq.getTemplateName());
        iemsSmsSendRecordNew.setCheckCode(sendSmsReq.getCheckCode());
        iemsSmsSendRecordNew.setSendWhenCode(sendSmsReq.getSendWhenCode());
        iemsSmsSendRecordNew.setSendWhenDesc(sendSmsReq.getSendWhenDesc());

        iemsSmsSendRecordNew.setPkId(TopcUUIDUtils.getUUIDWithoutDash());
        iemsSmsSendRecordNew.setIsDeleted(TopcStringConstant.N.toUpperCase());
        iemsSmsSendRecordNew.setRequestTime(System.currentTimeMillis());
        iemsSmsSendRecordNew.setSendStatus(TopcStringConstant.TWO);

        iemsSmsSendRecordNew.setCreateBy("system");
        iemsSmsSendRecordNew.setUpdateBy("system");
        iemsSmsSendRecordNew.setCreateDate(new Date());
        iemsSmsSendRecordNew.setUpdateDate(new Date());

        iemsSmsSendRecordMapper.insertSelective(iemsSmsSendRecordNew);
    }

    @Override
    public void updateIemsSmsSendRecord(IemsSmsSendRecord iemsSmsSendRecord) {
        iemsSmsSendRecordMapper.updateByPrimaryKeySelective(iemsSmsSendRecord);
    }

    @Override
    public void updateByOutId(String outId, String sendStatus, Long responseTime) {
        IemsSmsSendRecordExample iemsSmsSendRecordExample = new IemsSmsSendRecordExample();
        IemsSmsSendRecordExample.Criteria criteria = iemsSmsSendRecordExample.createCriteria();
        criteria.andOutIdEqualTo(outId);

        IemsSmsSendRecord iemsSmsSendRecord = new IemsSmsSendRecord();
        iemsSmsSendRecord.setOutId(outId);
        iemsSmsSendRecord.setUpdateDate(new Date());
        iemsSmsSendRecord.setSendStatus(sendStatus);
        iemsSmsSendRecord.setResponseTime(responseTime);

        iemsSmsSendRecordMapper.updateByExampleSelective(iemsSmsSendRecord, iemsSmsSendRecordExample);
    }
}
