package co.topc.base.message.mail.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IemsMailSendRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public IemsMailSendRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPkIdIsNull() {
            addCriterion("pk_id is null");
            return (Criteria) this;
        }

        public Criteria andPkIdIsNotNull() {
            addCriterion("pk_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkIdEqualTo(String value) {
            addCriterion("pk_id =", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotEqualTo(String value) {
            addCriterion("pk_id <>", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdGreaterThan(String value) {
            addCriterion("pk_id >", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdGreaterThanOrEqualTo(String value) {
            addCriterion("pk_id >=", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdLessThan(String value) {
            addCriterion("pk_id <", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdLessThanOrEqualTo(String value) {
            addCriterion("pk_id <=", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdLike(String value) {
            addCriterion("pk_id like", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotLike(String value) {
            addCriterion("pk_id not like", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdIn(List<String> values) {
            addCriterion("pk_id in", values, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotIn(List<String> values) {
            addCriterion("pk_id not in", values, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdBetween(String value1, String value2) {
            addCriterion("pk_id between", value1, value2, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotBetween(String value1, String value2) {
            addCriterion("pk_id not between", value1, value2, "pkId");
            return (Criteria) this;
        }

        public Criteria andMailSenderIsNull() {
            addCriterion("mail_sender is null");
            return (Criteria) this;
        }

        public Criteria andMailSenderIsNotNull() {
            addCriterion("mail_sender is not null");
            return (Criteria) this;
        }

        public Criteria andMailSenderEqualTo(String value) {
            addCriterion("mail_sender =", value, "mailSender");
            return (Criteria) this;
        }

        public Criteria andMailSenderNotEqualTo(String value) {
            addCriterion("mail_sender <>", value, "mailSender");
            return (Criteria) this;
        }

        public Criteria andMailSenderGreaterThan(String value) {
            addCriterion("mail_sender >", value, "mailSender");
            return (Criteria) this;
        }

        public Criteria andMailSenderGreaterThanOrEqualTo(String value) {
            addCriterion("mail_sender >=", value, "mailSender");
            return (Criteria) this;
        }

        public Criteria andMailSenderLessThan(String value) {
            addCriterion("mail_sender <", value, "mailSender");
            return (Criteria) this;
        }

        public Criteria andMailSenderLessThanOrEqualTo(String value) {
            addCriterion("mail_sender <=", value, "mailSender");
            return (Criteria) this;
        }

        public Criteria andMailSenderLike(String value) {
            addCriterion("mail_sender like", value, "mailSender");
            return (Criteria) this;
        }

        public Criteria andMailSenderNotLike(String value) {
            addCriterion("mail_sender not like", value, "mailSender");
            return (Criteria) this;
        }

        public Criteria andMailSenderIn(List<String> values) {
            addCriterion("mail_sender in", values, "mailSender");
            return (Criteria) this;
        }

        public Criteria andMailSenderNotIn(List<String> values) {
            addCriterion("mail_sender not in", values, "mailSender");
            return (Criteria) this;
        }

        public Criteria andMailSenderBetween(String value1, String value2) {
            addCriterion("mail_sender between", value1, value2, "mailSender");
            return (Criteria) this;
        }

        public Criteria andMailSenderNotBetween(String value1, String value2) {
            addCriterion("mail_sender not between", value1, value2, "mailSender");
            return (Criteria) this;
        }

        public Criteria andMailReceiverIsNull() {
            addCriterion("mail_receiver is null");
            return (Criteria) this;
        }

        public Criteria andMailReceiverIsNotNull() {
            addCriterion("mail_receiver is not null");
            return (Criteria) this;
        }

        public Criteria andMailReceiverEqualTo(String value) {
            addCriterion("mail_receiver =", value, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andMailReceiverNotEqualTo(String value) {
            addCriterion("mail_receiver <>", value, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andMailReceiverGreaterThan(String value) {
            addCriterion("mail_receiver >", value, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andMailReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("mail_receiver >=", value, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andMailReceiverLessThan(String value) {
            addCriterion("mail_receiver <", value, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andMailReceiverLessThanOrEqualTo(String value) {
            addCriterion("mail_receiver <=", value, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andMailReceiverLike(String value) {
            addCriterion("mail_receiver like", value, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andMailReceiverNotLike(String value) {
            addCriterion("mail_receiver not like", value, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andMailReceiverIn(List<String> values) {
            addCriterion("mail_receiver in", values, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andMailReceiverNotIn(List<String> values) {
            addCriterion("mail_receiver not in", values, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andMailReceiverBetween(String value1, String value2) {
            addCriterion("mail_receiver between", value1, value2, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andMailReceiverNotBetween(String value1, String value2) {
            addCriterion("mail_receiver not between", value1, value2, "mailReceiver");
            return (Criteria) this;
        }

        public Criteria andMailCopyToIsNull() {
            addCriterion("mail_copy_to is null");
            return (Criteria) this;
        }

        public Criteria andMailCopyToIsNotNull() {
            addCriterion("mail_copy_to is not null");
            return (Criteria) this;
        }

        public Criteria andMailCopyToEqualTo(String value) {
            addCriterion("mail_copy_to =", value, "mailCopyTo");
            return (Criteria) this;
        }

        public Criteria andMailCopyToNotEqualTo(String value) {
            addCriterion("mail_copy_to <>", value, "mailCopyTo");
            return (Criteria) this;
        }

        public Criteria andMailCopyToGreaterThan(String value) {
            addCriterion("mail_copy_to >", value, "mailCopyTo");
            return (Criteria) this;
        }

        public Criteria andMailCopyToGreaterThanOrEqualTo(String value) {
            addCriterion("mail_copy_to >=", value, "mailCopyTo");
            return (Criteria) this;
        }

        public Criteria andMailCopyToLessThan(String value) {
            addCriterion("mail_copy_to <", value, "mailCopyTo");
            return (Criteria) this;
        }

        public Criteria andMailCopyToLessThanOrEqualTo(String value) {
            addCriterion("mail_copy_to <=", value, "mailCopyTo");
            return (Criteria) this;
        }

        public Criteria andMailCopyToLike(String value) {
            addCriterion("mail_copy_to like", value, "mailCopyTo");
            return (Criteria) this;
        }

        public Criteria andMailCopyToNotLike(String value) {
            addCriterion("mail_copy_to not like", value, "mailCopyTo");
            return (Criteria) this;
        }

        public Criteria andMailCopyToIn(List<String> values) {
            addCriterion("mail_copy_to in", values, "mailCopyTo");
            return (Criteria) this;
        }

        public Criteria andMailCopyToNotIn(List<String> values) {
            addCriterion("mail_copy_to not in", values, "mailCopyTo");
            return (Criteria) this;
        }

        public Criteria andMailCopyToBetween(String value1, String value2) {
            addCriterion("mail_copy_to between", value1, value2, "mailCopyTo");
            return (Criteria) this;
        }

        public Criteria andMailCopyToNotBetween(String value1, String value2) {
            addCriterion("mail_copy_to not between", value1, value2, "mailCopyTo");
            return (Criteria) this;
        }

        public Criteria andMailSubjectIsNull() {
            addCriterion("mail_subject is null");
            return (Criteria) this;
        }

        public Criteria andMailSubjectIsNotNull() {
            addCriterion("mail_subject is not null");
            return (Criteria) this;
        }

        public Criteria andMailSubjectEqualTo(String value) {
            addCriterion("mail_subject =", value, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectNotEqualTo(String value) {
            addCriterion("mail_subject <>", value, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectGreaterThan(String value) {
            addCriterion("mail_subject >", value, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("mail_subject >=", value, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectLessThan(String value) {
            addCriterion("mail_subject <", value, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectLessThanOrEqualTo(String value) {
            addCriterion("mail_subject <=", value, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectLike(String value) {
            addCriterion("mail_subject like", value, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectNotLike(String value) {
            addCriterion("mail_subject not like", value, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectIn(List<String> values) {
            addCriterion("mail_subject in", values, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectNotIn(List<String> values) {
            addCriterion("mail_subject not in", values, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectBetween(String value1, String value2) {
            addCriterion("mail_subject between", value1, value2, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectNotBetween(String value1, String value2) {
            addCriterion("mail_subject not between", value1, value2, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailTypeIsNull() {
            addCriterion("mail_type is null");
            return (Criteria) this;
        }

        public Criteria andMailTypeIsNotNull() {
            addCriterion("mail_type is not null");
            return (Criteria) this;
        }

        public Criteria andMailTypeEqualTo(String value) {
            addCriterion("mail_type =", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeNotEqualTo(String value) {
            addCriterion("mail_type <>", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeGreaterThan(String value) {
            addCriterion("mail_type >", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeGreaterThanOrEqualTo(String value) {
            addCriterion("mail_type >=", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeLessThan(String value) {
            addCriterion("mail_type <", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeLessThanOrEqualTo(String value) {
            addCriterion("mail_type <=", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeLike(String value) {
            addCriterion("mail_type like", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeNotLike(String value) {
            addCriterion("mail_type not like", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeIn(List<String> values) {
            addCriterion("mail_type in", values, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeNotIn(List<String> values) {
            addCriterion("mail_type not in", values, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeBetween(String value1, String value2) {
            addCriterion("mail_type between", value1, value2, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeNotBetween(String value1, String value2) {
            addCriterion("mail_type not between", value1, value2, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailAttachmentIsNull() {
            addCriterion("mail_attachment is null");
            return (Criteria) this;
        }

        public Criteria andMailAttachmentIsNotNull() {
            addCriterion("mail_attachment is not null");
            return (Criteria) this;
        }

        public Criteria andMailAttachmentEqualTo(String value) {
            addCriterion("mail_attachment =", value, "mailAttachment");
            return (Criteria) this;
        }

        public Criteria andMailAttachmentNotEqualTo(String value) {
            addCriterion("mail_attachment <>", value, "mailAttachment");
            return (Criteria) this;
        }

        public Criteria andMailAttachmentGreaterThan(String value) {
            addCriterion("mail_attachment >", value, "mailAttachment");
            return (Criteria) this;
        }

        public Criteria andMailAttachmentGreaterThanOrEqualTo(String value) {
            addCriterion("mail_attachment >=", value, "mailAttachment");
            return (Criteria) this;
        }

        public Criteria andMailAttachmentLessThan(String value) {
            addCriterion("mail_attachment <", value, "mailAttachment");
            return (Criteria) this;
        }

        public Criteria andMailAttachmentLessThanOrEqualTo(String value) {
            addCriterion("mail_attachment <=", value, "mailAttachment");
            return (Criteria) this;
        }

        public Criteria andMailAttachmentLike(String value) {
            addCriterion("mail_attachment like", value, "mailAttachment");
            return (Criteria) this;
        }

        public Criteria andMailAttachmentNotLike(String value) {
            addCriterion("mail_attachment not like", value, "mailAttachment");
            return (Criteria) this;
        }

        public Criteria andMailAttachmentIn(List<String> values) {
            addCriterion("mail_attachment in", values, "mailAttachment");
            return (Criteria) this;
        }

        public Criteria andMailAttachmentNotIn(List<String> values) {
            addCriterion("mail_attachment not in", values, "mailAttachment");
            return (Criteria) this;
        }

        public Criteria andMailAttachmentBetween(String value1, String value2) {
            addCriterion("mail_attachment between", value1, value2, "mailAttachment");
            return (Criteria) this;
        }

        public Criteria andMailAttachmentNotBetween(String value1, String value2) {
            addCriterion("mail_attachment not between", value1, value2, "mailAttachment");
            return (Criteria) this;
        }

        public Criteria andMailSendStatusIsNull() {
            addCriterion("mail_send_status is null");
            return (Criteria) this;
        }

        public Criteria andMailSendStatusIsNotNull() {
            addCriterion("mail_send_status is not null");
            return (Criteria) this;
        }

        public Criteria andMailSendStatusEqualTo(String value) {
            addCriterion("mail_send_status =", value, "mailSendStatus");
            return (Criteria) this;
        }

        public Criteria andMailSendStatusNotEqualTo(String value) {
            addCriterion("mail_send_status <>", value, "mailSendStatus");
            return (Criteria) this;
        }

        public Criteria andMailSendStatusGreaterThan(String value) {
            addCriterion("mail_send_status >", value, "mailSendStatus");
            return (Criteria) this;
        }

        public Criteria andMailSendStatusGreaterThanOrEqualTo(String value) {
            addCriterion("mail_send_status >=", value, "mailSendStatus");
            return (Criteria) this;
        }

        public Criteria andMailSendStatusLessThan(String value) {
            addCriterion("mail_send_status <", value, "mailSendStatus");
            return (Criteria) this;
        }

        public Criteria andMailSendStatusLessThanOrEqualTo(String value) {
            addCriterion("mail_send_status <=", value, "mailSendStatus");
            return (Criteria) this;
        }

        public Criteria andMailSendStatusLike(String value) {
            addCriterion("mail_send_status like", value, "mailSendStatus");
            return (Criteria) this;
        }

        public Criteria andMailSendStatusNotLike(String value) {
            addCriterion("mail_send_status not like", value, "mailSendStatus");
            return (Criteria) this;
        }

        public Criteria andMailSendStatusIn(List<String> values) {
            addCriterion("mail_send_status in", values, "mailSendStatus");
            return (Criteria) this;
        }

        public Criteria andMailSendStatusNotIn(List<String> values) {
            addCriterion("mail_send_status not in", values, "mailSendStatus");
            return (Criteria) this;
        }

        public Criteria andMailSendStatusBetween(String value1, String value2) {
            addCriterion("mail_send_status between", value1, value2, "mailSendStatus");
            return (Criteria) this;
        }

        public Criteria andMailSendStatusNotBetween(String value1, String value2) {
            addCriterion("mail_send_status not between", value1, value2, "mailSendStatus");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(String value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(String value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(String value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(String value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(String value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLike(String value) {
            addCriterion("is_deleted like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotLike(String value) {
            addCriterion("is_deleted not like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<String> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<String> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(String value1, String value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(String value1, String value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}