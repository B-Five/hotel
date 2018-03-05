package com.lllllw.hotel.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCLastnameIsNull() {
            addCriterion("c_lastname is null");
            return (Criteria) this;
        }

        public Criteria andCLastnameIsNotNull() {
            addCriterion("c_lastname is not null");
            return (Criteria) this;
        }

        public Criteria andCLastnameEqualTo(String value) {
            addCriterion("c_lastname =", value, "cLastname");
            return (Criteria) this;
        }

        public Criteria andCLastnameNotEqualTo(String value) {
            addCriterion("c_lastname <>", value, "cLastname");
            return (Criteria) this;
        }

        public Criteria andCLastnameGreaterThan(String value) {
            addCriterion("c_lastname >", value, "cLastname");
            return (Criteria) this;
        }

        public Criteria andCLastnameGreaterThanOrEqualTo(String value) {
            addCriterion("c_lastname >=", value, "cLastname");
            return (Criteria) this;
        }

        public Criteria andCLastnameLessThan(String value) {
            addCriterion("c_lastname <", value, "cLastname");
            return (Criteria) this;
        }

        public Criteria andCLastnameLessThanOrEqualTo(String value) {
            addCriterion("c_lastname <=", value, "cLastname");
            return (Criteria) this;
        }

        public Criteria andCLastnameLike(String value) {
            addCriterion("c_lastname like", value, "cLastname");
            return (Criteria) this;
        }

        public Criteria andCLastnameNotLike(String value) {
            addCriterion("c_lastname not like", value, "cLastname");
            return (Criteria) this;
        }

        public Criteria andCLastnameIn(List<String> values) {
            addCriterion("c_lastname in", values, "cLastname");
            return (Criteria) this;
        }

        public Criteria andCLastnameNotIn(List<String> values) {
            addCriterion("c_lastname not in", values, "cLastname");
            return (Criteria) this;
        }

        public Criteria andCLastnameBetween(String value1, String value2) {
            addCriterion("c_lastname between", value1, value2, "cLastname");
            return (Criteria) this;
        }

        public Criteria andCLastnameNotBetween(String value1, String value2) {
            addCriterion("c_lastname not between", value1, value2, "cLastname");
            return (Criteria) this;
        }

        public Criteria andCFirstnameIsNull() {
            addCriterion("c_firstname is null");
            return (Criteria) this;
        }

        public Criteria andCFirstnameIsNotNull() {
            addCriterion("c_firstname is not null");
            return (Criteria) this;
        }

        public Criteria andCFirstnameEqualTo(String value) {
            addCriterion("c_firstname =", value, "cFirstname");
            return (Criteria) this;
        }

        public Criteria andCFirstnameNotEqualTo(String value) {
            addCriterion("c_firstname <>", value, "cFirstname");
            return (Criteria) this;
        }

        public Criteria andCFirstnameGreaterThan(String value) {
            addCriterion("c_firstname >", value, "cFirstname");
            return (Criteria) this;
        }

        public Criteria andCFirstnameGreaterThanOrEqualTo(String value) {
            addCriterion("c_firstname >=", value, "cFirstname");
            return (Criteria) this;
        }

        public Criteria andCFirstnameLessThan(String value) {
            addCriterion("c_firstname <", value, "cFirstname");
            return (Criteria) this;
        }

        public Criteria andCFirstnameLessThanOrEqualTo(String value) {
            addCriterion("c_firstname <=", value, "cFirstname");
            return (Criteria) this;
        }

        public Criteria andCFirstnameLike(String value) {
            addCriterion("c_firstname like", value, "cFirstname");
            return (Criteria) this;
        }

        public Criteria andCFirstnameNotLike(String value) {
            addCriterion("c_firstname not like", value, "cFirstname");
            return (Criteria) this;
        }

        public Criteria andCFirstnameIn(List<String> values) {
            addCriterion("c_firstname in", values, "cFirstname");
            return (Criteria) this;
        }

        public Criteria andCFirstnameNotIn(List<String> values) {
            addCriterion("c_firstname not in", values, "cFirstname");
            return (Criteria) this;
        }

        public Criteria andCFirstnameBetween(String value1, String value2) {
            addCriterion("c_firstname between", value1, value2, "cFirstname");
            return (Criteria) this;
        }

        public Criteria andCFirstnameNotBetween(String value1, String value2) {
            addCriterion("c_firstname not between", value1, value2, "cFirstname");
            return (Criteria) this;
        }

        public Criteria andCPasswordIsNull() {
            addCriterion("c_password is null");
            return (Criteria) this;
        }

        public Criteria andCPasswordIsNotNull() {
            addCriterion("c_password is not null");
            return (Criteria) this;
        }

        public Criteria andCPasswordEqualTo(String value) {
            addCriterion("c_password =", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotEqualTo(String value) {
            addCriterion("c_password <>", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordGreaterThan(String value) {
            addCriterion("c_password >", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("c_password >=", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLessThan(String value) {
            addCriterion("c_password <", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLessThanOrEqualTo(String value) {
            addCriterion("c_password <=", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLike(String value) {
            addCriterion("c_password like", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotLike(String value) {
            addCriterion("c_password not like", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordIn(List<String> values) {
            addCriterion("c_password in", values, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotIn(List<String> values) {
            addCriterion("c_password not in", values, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordBetween(String value1, String value2) {
            addCriterion("c_password between", value1, value2, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotBetween(String value1, String value2) {
            addCriterion("c_password not between", value1, value2, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPhoneIsNull() {
            addCriterion("c_phone is null");
            return (Criteria) this;
        }

        public Criteria andCPhoneIsNotNull() {
            addCriterion("c_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCPhoneEqualTo(String value) {
            addCriterion("c_phone =", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneNotEqualTo(String value) {
            addCriterion("c_phone <>", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneGreaterThan(String value) {
            addCriterion("c_phone >", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("c_phone >=", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneLessThan(String value) {
            addCriterion("c_phone <", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneLessThanOrEqualTo(String value) {
            addCriterion("c_phone <=", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneLike(String value) {
            addCriterion("c_phone like", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneNotLike(String value) {
            addCriterion("c_phone not like", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneIn(List<String> values) {
            addCriterion("c_phone in", values, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneNotIn(List<String> values) {
            addCriterion("c_phone not in", values, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneBetween(String value1, String value2) {
            addCriterion("c_phone between", value1, value2, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneNotBetween(String value1, String value2) {
            addCriterion("c_phone not between", value1, value2, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCEmailIsNull() {
            addCriterion("c_email is null");
            return (Criteria) this;
        }

        public Criteria andCEmailIsNotNull() {
            addCriterion("c_email is not null");
            return (Criteria) this;
        }

        public Criteria andCEmailEqualTo(String value) {
            addCriterion("c_email =", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailNotEqualTo(String value) {
            addCriterion("c_email <>", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailGreaterThan(String value) {
            addCriterion("c_email >", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailGreaterThanOrEqualTo(String value) {
            addCriterion("c_email >=", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailLessThan(String value) {
            addCriterion("c_email <", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailLessThanOrEqualTo(String value) {
            addCriterion("c_email <=", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailLike(String value) {
            addCriterion("c_email like", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailNotLike(String value) {
            addCriterion("c_email not like", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailIn(List<String> values) {
            addCriterion("c_email in", values, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailNotIn(List<String> values) {
            addCriterion("c_email not in", values, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailBetween(String value1, String value2) {
            addCriterion("c_email between", value1, value2, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailNotBetween(String value1, String value2) {
            addCriterion("c_email not between", value1, value2, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCGenderIsNull() {
            addCriterion("c_gender is null");
            return (Criteria) this;
        }

        public Criteria andCGenderIsNotNull() {
            addCriterion("c_gender is not null");
            return (Criteria) this;
        }

        public Criteria andCGenderEqualTo(String value) {
            addCriterion("c_gender =", value, "cGender");
            return (Criteria) this;
        }

        public Criteria andCGenderNotEqualTo(String value) {
            addCriterion("c_gender <>", value, "cGender");
            return (Criteria) this;
        }

        public Criteria andCGenderGreaterThan(String value) {
            addCriterion("c_gender >", value, "cGender");
            return (Criteria) this;
        }

        public Criteria andCGenderGreaterThanOrEqualTo(String value) {
            addCriterion("c_gender >=", value, "cGender");
            return (Criteria) this;
        }

        public Criteria andCGenderLessThan(String value) {
            addCriterion("c_gender <", value, "cGender");
            return (Criteria) this;
        }

        public Criteria andCGenderLessThanOrEqualTo(String value) {
            addCriterion("c_gender <=", value, "cGender");
            return (Criteria) this;
        }

        public Criteria andCGenderLike(String value) {
            addCriterion("c_gender like", value, "cGender");
            return (Criteria) this;
        }

        public Criteria andCGenderNotLike(String value) {
            addCriterion("c_gender not like", value, "cGender");
            return (Criteria) this;
        }

        public Criteria andCGenderIn(List<String> values) {
            addCriterion("c_gender in", values, "cGender");
            return (Criteria) this;
        }

        public Criteria andCGenderNotIn(List<String> values) {
            addCriterion("c_gender not in", values, "cGender");
            return (Criteria) this;
        }

        public Criteria andCGenderBetween(String value1, String value2) {
            addCriterion("c_gender between", value1, value2, "cGender");
            return (Criteria) this;
        }

        public Criteria andCGenderNotBetween(String value1, String value2) {
            addCriterion("c_gender not between", value1, value2, "cGender");
            return (Criteria) this;
        }

        public Criteria andCCreatedIsNull() {
            addCriterion("c_created is null");
            return (Criteria) this;
        }

        public Criteria andCCreatedIsNotNull() {
            addCriterion("c_created is not null");
            return (Criteria) this;
        }

        public Criteria andCCreatedEqualTo(Date value) {
            addCriterion("c_created =", value, "cCreated");
            return (Criteria) this;
        }

        public Criteria andCCreatedNotEqualTo(Date value) {
            addCriterion("c_created <>", value, "cCreated");
            return (Criteria) this;
        }

        public Criteria andCCreatedGreaterThan(Date value) {
            addCriterion("c_created >", value, "cCreated");
            return (Criteria) this;
        }

        public Criteria andCCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("c_created >=", value, "cCreated");
            return (Criteria) this;
        }

        public Criteria andCCreatedLessThan(Date value) {
            addCriterion("c_created <", value, "cCreated");
            return (Criteria) this;
        }

        public Criteria andCCreatedLessThanOrEqualTo(Date value) {
            addCriterion("c_created <=", value, "cCreated");
            return (Criteria) this;
        }

        public Criteria andCCreatedIn(List<Date> values) {
            addCriterion("c_created in", values, "cCreated");
            return (Criteria) this;
        }

        public Criteria andCCreatedNotIn(List<Date> values) {
            addCriterion("c_created not in", values, "cCreated");
            return (Criteria) this;
        }

        public Criteria andCCreatedBetween(Date value1, Date value2) {
            addCriterion("c_created between", value1, value2, "cCreated");
            return (Criteria) this;
        }

        public Criteria andCCreatedNotBetween(Date value1, Date value2) {
            addCriterion("c_created not between", value1, value2, "cCreated");
            return (Criteria) this;
        }

        public Criteria andCUpdatedIsNull() {
            addCriterion("c_updated is null");
            return (Criteria) this;
        }

        public Criteria andCUpdatedIsNotNull() {
            addCriterion("c_updated is not null");
            return (Criteria) this;
        }

        public Criteria andCUpdatedEqualTo(Date value) {
            addCriterion("c_updated =", value, "cUpdated");
            return (Criteria) this;
        }

        public Criteria andCUpdatedNotEqualTo(Date value) {
            addCriterion("c_updated <>", value, "cUpdated");
            return (Criteria) this;
        }

        public Criteria andCUpdatedGreaterThan(Date value) {
            addCriterion("c_updated >", value, "cUpdated");
            return (Criteria) this;
        }

        public Criteria andCUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("c_updated >=", value, "cUpdated");
            return (Criteria) this;
        }

        public Criteria andCUpdatedLessThan(Date value) {
            addCriterion("c_updated <", value, "cUpdated");
            return (Criteria) this;
        }

        public Criteria andCUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("c_updated <=", value, "cUpdated");
            return (Criteria) this;
        }

        public Criteria andCUpdatedIn(List<Date> values) {
            addCriterion("c_updated in", values, "cUpdated");
            return (Criteria) this;
        }

        public Criteria andCUpdatedNotIn(List<Date> values) {
            addCriterion("c_updated not in", values, "cUpdated");
            return (Criteria) this;
        }

        public Criteria andCUpdatedBetween(Date value1, Date value2) {
            addCriterion("c_updated between", value1, value2, "cUpdated");
            return (Criteria) this;
        }

        public Criteria andCUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("c_updated not between", value1, value2, "cUpdated");
            return (Criteria) this;
        }

        public Criteria andCIntfield1IsNull() {
            addCriterion("c_intField1 is null");
            return (Criteria) this;
        }

        public Criteria andCIntfield1IsNotNull() {
            addCriterion("c_intField1 is not null");
            return (Criteria) this;
        }

        public Criteria andCIntfield1EqualTo(Integer value) {
            addCriterion("c_intField1 =", value, "cIntfield1");
            return (Criteria) this;
        }

        public Criteria andCIntfield1NotEqualTo(Integer value) {
            addCriterion("c_intField1 <>", value, "cIntfield1");
            return (Criteria) this;
        }

        public Criteria andCIntfield1GreaterThan(Integer value) {
            addCriterion("c_intField1 >", value, "cIntfield1");
            return (Criteria) this;
        }

        public Criteria andCIntfield1GreaterThanOrEqualTo(Integer value) {
            addCriterion("c_intField1 >=", value, "cIntfield1");
            return (Criteria) this;
        }

        public Criteria andCIntfield1LessThan(Integer value) {
            addCriterion("c_intField1 <", value, "cIntfield1");
            return (Criteria) this;
        }

        public Criteria andCIntfield1LessThanOrEqualTo(Integer value) {
            addCriterion("c_intField1 <=", value, "cIntfield1");
            return (Criteria) this;
        }

        public Criteria andCIntfield1In(List<Integer> values) {
            addCriterion("c_intField1 in", values, "cIntfield1");
            return (Criteria) this;
        }

        public Criteria andCIntfield1NotIn(List<Integer> values) {
            addCriterion("c_intField1 not in", values, "cIntfield1");
            return (Criteria) this;
        }

        public Criteria andCIntfield1Between(Integer value1, Integer value2) {
            addCriterion("c_intField1 between", value1, value2, "cIntfield1");
            return (Criteria) this;
        }

        public Criteria andCIntfield1NotBetween(Integer value1, Integer value2) {
            addCriterion("c_intField1 not between", value1, value2, "cIntfield1");
            return (Criteria) this;
        }

        public Criteria andCIntfield2IsNull() {
            addCriterion("c_intField2 is null");
            return (Criteria) this;
        }

        public Criteria andCIntfield2IsNotNull() {
            addCriterion("c_intField2 is not null");
            return (Criteria) this;
        }

        public Criteria andCIntfield2EqualTo(Integer value) {
            addCriterion("c_intField2 =", value, "cIntfield2");
            return (Criteria) this;
        }

        public Criteria andCIntfield2NotEqualTo(Integer value) {
            addCriterion("c_intField2 <>", value, "cIntfield2");
            return (Criteria) this;
        }

        public Criteria andCIntfield2GreaterThan(Integer value) {
            addCriterion("c_intField2 >", value, "cIntfield2");
            return (Criteria) this;
        }

        public Criteria andCIntfield2GreaterThanOrEqualTo(Integer value) {
            addCriterion("c_intField2 >=", value, "cIntfield2");
            return (Criteria) this;
        }

        public Criteria andCIntfield2LessThan(Integer value) {
            addCriterion("c_intField2 <", value, "cIntfield2");
            return (Criteria) this;
        }

        public Criteria andCIntfield2LessThanOrEqualTo(Integer value) {
            addCriterion("c_intField2 <=", value, "cIntfield2");
            return (Criteria) this;
        }

        public Criteria andCIntfield2In(List<Integer> values) {
            addCriterion("c_intField2 in", values, "cIntfield2");
            return (Criteria) this;
        }

        public Criteria andCIntfield2NotIn(List<Integer> values) {
            addCriterion("c_intField2 not in", values, "cIntfield2");
            return (Criteria) this;
        }

        public Criteria andCIntfield2Between(Integer value1, Integer value2) {
            addCriterion("c_intField2 between", value1, value2, "cIntfield2");
            return (Criteria) this;
        }

        public Criteria andCIntfield2NotBetween(Integer value1, Integer value2) {
            addCriterion("c_intField2 not between", value1, value2, "cIntfield2");
            return (Criteria) this;
        }

        public Criteria andCStringfield1IsNull() {
            addCriterion("c_stringField1 is null");
            return (Criteria) this;
        }

        public Criteria andCStringfield1IsNotNull() {
            addCriterion("c_stringField1 is not null");
            return (Criteria) this;
        }

        public Criteria andCStringfield1EqualTo(String value) {
            addCriterion("c_stringField1 =", value, "cStringfield1");
            return (Criteria) this;
        }

        public Criteria andCStringfield1NotEqualTo(String value) {
            addCriterion("c_stringField1 <>", value, "cStringfield1");
            return (Criteria) this;
        }

        public Criteria andCStringfield1GreaterThan(String value) {
            addCriterion("c_stringField1 >", value, "cStringfield1");
            return (Criteria) this;
        }

        public Criteria andCStringfield1GreaterThanOrEqualTo(String value) {
            addCriterion("c_stringField1 >=", value, "cStringfield1");
            return (Criteria) this;
        }

        public Criteria andCStringfield1LessThan(String value) {
            addCriterion("c_stringField1 <", value, "cStringfield1");
            return (Criteria) this;
        }

        public Criteria andCStringfield1LessThanOrEqualTo(String value) {
            addCriterion("c_stringField1 <=", value, "cStringfield1");
            return (Criteria) this;
        }

        public Criteria andCStringfield1Like(String value) {
            addCriterion("c_stringField1 like", value, "cStringfield1");
            return (Criteria) this;
        }

        public Criteria andCStringfield1NotLike(String value) {
            addCriterion("c_stringField1 not like", value, "cStringfield1");
            return (Criteria) this;
        }

        public Criteria andCStringfield1In(List<String> values) {
            addCriterion("c_stringField1 in", values, "cStringfield1");
            return (Criteria) this;
        }

        public Criteria andCStringfield1NotIn(List<String> values) {
            addCriterion("c_stringField1 not in", values, "cStringfield1");
            return (Criteria) this;
        }

        public Criteria andCStringfield1Between(String value1, String value2) {
            addCriterion("c_stringField1 between", value1, value2, "cStringfield1");
            return (Criteria) this;
        }

        public Criteria andCStringfield1NotBetween(String value1, String value2) {
            addCriterion("c_stringField1 not between", value1, value2, "cStringfield1");
            return (Criteria) this;
        }

        public Criteria andCStringfield2IsNull() {
            addCriterion("c_stringField2 is null");
            return (Criteria) this;
        }

        public Criteria andCStringfield2IsNotNull() {
            addCriterion("c_stringField2 is not null");
            return (Criteria) this;
        }

        public Criteria andCStringfield2EqualTo(String value) {
            addCriterion("c_stringField2 =", value, "cStringfield2");
            return (Criteria) this;
        }

        public Criteria andCStringfield2NotEqualTo(String value) {
            addCriterion("c_stringField2 <>", value, "cStringfield2");
            return (Criteria) this;
        }

        public Criteria andCStringfield2GreaterThan(String value) {
            addCriterion("c_stringField2 >", value, "cStringfield2");
            return (Criteria) this;
        }

        public Criteria andCStringfield2GreaterThanOrEqualTo(String value) {
            addCriterion("c_stringField2 >=", value, "cStringfield2");
            return (Criteria) this;
        }

        public Criteria andCStringfield2LessThan(String value) {
            addCriterion("c_stringField2 <", value, "cStringfield2");
            return (Criteria) this;
        }

        public Criteria andCStringfield2LessThanOrEqualTo(String value) {
            addCriterion("c_stringField2 <=", value, "cStringfield2");
            return (Criteria) this;
        }

        public Criteria andCStringfield2Like(String value) {
            addCriterion("c_stringField2 like", value, "cStringfield2");
            return (Criteria) this;
        }

        public Criteria andCStringfield2NotLike(String value) {
            addCriterion("c_stringField2 not like", value, "cStringfield2");
            return (Criteria) this;
        }

        public Criteria andCStringfield2In(List<String> values) {
            addCriterion("c_stringField2 in", values, "cStringfield2");
            return (Criteria) this;
        }

        public Criteria andCStringfield2NotIn(List<String> values) {
            addCriterion("c_stringField2 not in", values, "cStringfield2");
            return (Criteria) this;
        }

        public Criteria andCStringfield2Between(String value1, String value2) {
            addCriterion("c_stringField2 between", value1, value2, "cStringfield2");
            return (Criteria) this;
        }

        public Criteria andCStringfield2NotBetween(String value1, String value2) {
            addCriterion("c_stringField2 not between", value1, value2, "cStringfield2");
            return (Criteria) this;
        }

        public Criteria andCDatefield1IsNull() {
            addCriterion("c_dateField1 is null");
            return (Criteria) this;
        }

        public Criteria andCDatefield1IsNotNull() {
            addCriterion("c_dateField1 is not null");
            return (Criteria) this;
        }

        public Criteria andCDatefield1EqualTo(Date value) {
            addCriterionForJDBCDate("c_dateField1 =", value, "cDatefield1");
            return (Criteria) this;
        }

        public Criteria andCDatefield1NotEqualTo(Date value) {
            addCriterionForJDBCDate("c_dateField1 <>", value, "cDatefield1");
            return (Criteria) this;
        }

        public Criteria andCDatefield1GreaterThan(Date value) {
            addCriterionForJDBCDate("c_dateField1 >", value, "cDatefield1");
            return (Criteria) this;
        }

        public Criteria andCDatefield1GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_dateField1 >=", value, "cDatefield1");
            return (Criteria) this;
        }

        public Criteria andCDatefield1LessThan(Date value) {
            addCriterionForJDBCDate("c_dateField1 <", value, "cDatefield1");
            return (Criteria) this;
        }

        public Criteria andCDatefield1LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_dateField1 <=", value, "cDatefield1");
            return (Criteria) this;
        }

        public Criteria andCDatefield1In(List<Date> values) {
            addCriterionForJDBCDate("c_dateField1 in", values, "cDatefield1");
            return (Criteria) this;
        }

        public Criteria andCDatefield1NotIn(List<Date> values) {
            addCriterionForJDBCDate("c_dateField1 not in", values, "cDatefield1");
            return (Criteria) this;
        }

        public Criteria andCDatefield1Between(Date value1, Date value2) {
            addCriterionForJDBCDate("c_dateField1 between", value1, value2, "cDatefield1");
            return (Criteria) this;
        }

        public Criteria andCDatefield1NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_dateField1 not between", value1, value2, "cDatefield1");
            return (Criteria) this;
        }

        public Criteria andCDatefield2IsNull() {
            addCriterion("c_dateField2 is null");
            return (Criteria) this;
        }

        public Criteria andCDatefield2IsNotNull() {
            addCriterion("c_dateField2 is not null");
            return (Criteria) this;
        }

        public Criteria andCDatefield2EqualTo(Date value) {
            addCriterionForJDBCDate("c_dateField2 =", value, "cDatefield2");
            return (Criteria) this;
        }

        public Criteria andCDatefield2NotEqualTo(Date value) {
            addCriterionForJDBCDate("c_dateField2 <>", value, "cDatefield2");
            return (Criteria) this;
        }

        public Criteria andCDatefield2GreaterThan(Date value) {
            addCriterionForJDBCDate("c_dateField2 >", value, "cDatefield2");
            return (Criteria) this;
        }

        public Criteria andCDatefield2GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_dateField2 >=", value, "cDatefield2");
            return (Criteria) this;
        }

        public Criteria andCDatefield2LessThan(Date value) {
            addCriterionForJDBCDate("c_dateField2 <", value, "cDatefield2");
            return (Criteria) this;
        }

        public Criteria andCDatefield2LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_dateField2 <=", value, "cDatefield2");
            return (Criteria) this;
        }

        public Criteria andCDatefield2In(List<Date> values) {
            addCriterionForJDBCDate("c_dateField2 in", values, "cDatefield2");
            return (Criteria) this;
        }

        public Criteria andCDatefield2NotIn(List<Date> values) {
            addCriterionForJDBCDate("c_dateField2 not in", values, "cDatefield2");
            return (Criteria) this;
        }

        public Criteria andCDatefield2Between(Date value1, Date value2) {
            addCriterionForJDBCDate("c_dateField2 between", value1, value2, "cDatefield2");
            return (Criteria) this;
        }

        public Criteria andCDatefield2NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_dateField2 not between", value1, value2, "cDatefield2");
            return (Criteria) this;
        }

        public Criteria andCDatetimefield1IsNull() {
            addCriterion("c_datetimeField1 is null");
            return (Criteria) this;
        }

        public Criteria andCDatetimefield1IsNotNull() {
            addCriterion("c_datetimeField1 is not null");
            return (Criteria) this;
        }

        public Criteria andCDatetimefield1EqualTo(Date value) {
            addCriterion("c_datetimeField1 =", value, "cDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andCDatetimefield1NotEqualTo(Date value) {
            addCriterion("c_datetimeField1 <>", value, "cDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andCDatetimefield1GreaterThan(Date value) {
            addCriterion("c_datetimeField1 >", value, "cDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andCDatetimefield1GreaterThanOrEqualTo(Date value) {
            addCriterion("c_datetimeField1 >=", value, "cDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andCDatetimefield1LessThan(Date value) {
            addCriterion("c_datetimeField1 <", value, "cDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andCDatetimefield1LessThanOrEqualTo(Date value) {
            addCriterion("c_datetimeField1 <=", value, "cDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andCDatetimefield1In(List<Date> values) {
            addCriterion("c_datetimeField1 in", values, "cDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andCDatetimefield1NotIn(List<Date> values) {
            addCriterion("c_datetimeField1 not in", values, "cDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andCDatetimefield1Between(Date value1, Date value2) {
            addCriterion("c_datetimeField1 between", value1, value2, "cDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andCDatetimefield1NotBetween(Date value1, Date value2) {
            addCriterion("c_datetimeField1 not between", value1, value2, "cDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andCDatetimefield2IsNull() {
            addCriterion("c_datetimeField2 is null");
            return (Criteria) this;
        }

        public Criteria andCDatetimefield2IsNotNull() {
            addCriterion("c_datetimeField2 is not null");
            return (Criteria) this;
        }

        public Criteria andCDatetimefield2EqualTo(Date value) {
            addCriterion("c_datetimeField2 =", value, "cDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andCDatetimefield2NotEqualTo(Date value) {
            addCriterion("c_datetimeField2 <>", value, "cDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andCDatetimefield2GreaterThan(Date value) {
            addCriterion("c_datetimeField2 >", value, "cDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andCDatetimefield2GreaterThanOrEqualTo(Date value) {
            addCriterion("c_datetimeField2 >=", value, "cDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andCDatetimefield2LessThan(Date value) {
            addCriterion("c_datetimeField2 <", value, "cDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andCDatetimefield2LessThanOrEqualTo(Date value) {
            addCriterion("c_datetimeField2 <=", value, "cDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andCDatetimefield2In(List<Date> values) {
            addCriterion("c_datetimeField2 in", values, "cDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andCDatetimefield2NotIn(List<Date> values) {
            addCriterion("c_datetimeField2 not in", values, "cDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andCDatetimefield2Between(Date value1, Date value2) {
            addCriterion("c_datetimeField2 between", value1, value2, "cDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andCDatetimefield2NotBetween(Date value1, Date value2) {
            addCriterion("c_datetimeField2 not between", value1, value2, "cDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andCBoolfield1IsNull() {
            addCriterion("c_boolField1 is null");
            return (Criteria) this;
        }

        public Criteria andCBoolfield1IsNotNull() {
            addCriterion("c_boolField1 is not null");
            return (Criteria) this;
        }

        public Criteria andCBoolfield1EqualTo(Boolean value) {
            addCriterion("c_boolField1 =", value, "cBoolfield1");
            return (Criteria) this;
        }

        public Criteria andCBoolfield1NotEqualTo(Boolean value) {
            addCriterion("c_boolField1 <>", value, "cBoolfield1");
            return (Criteria) this;
        }

        public Criteria andCBoolfield1GreaterThan(Boolean value) {
            addCriterion("c_boolField1 >", value, "cBoolfield1");
            return (Criteria) this;
        }

        public Criteria andCBoolfield1GreaterThanOrEqualTo(Boolean value) {
            addCriterion("c_boolField1 >=", value, "cBoolfield1");
            return (Criteria) this;
        }

        public Criteria andCBoolfield1LessThan(Boolean value) {
            addCriterion("c_boolField1 <", value, "cBoolfield1");
            return (Criteria) this;
        }

        public Criteria andCBoolfield1LessThanOrEqualTo(Boolean value) {
            addCriterion("c_boolField1 <=", value, "cBoolfield1");
            return (Criteria) this;
        }

        public Criteria andCBoolfield1In(List<Boolean> values) {
            addCriterion("c_boolField1 in", values, "cBoolfield1");
            return (Criteria) this;
        }

        public Criteria andCBoolfield1NotIn(List<Boolean> values) {
            addCriterion("c_boolField1 not in", values, "cBoolfield1");
            return (Criteria) this;
        }

        public Criteria andCBoolfield1Between(Boolean value1, Boolean value2) {
            addCriterion("c_boolField1 between", value1, value2, "cBoolfield1");
            return (Criteria) this;
        }

        public Criteria andCBoolfield1NotBetween(Boolean value1, Boolean value2) {
            addCriterion("c_boolField1 not between", value1, value2, "cBoolfield1");
            return (Criteria) this;
        }

        public Criteria andCBoolfield2IsNull() {
            addCriterion("c_boolField2 is null");
            return (Criteria) this;
        }

        public Criteria andCBoolfield2IsNotNull() {
            addCriterion("c_boolField2 is not null");
            return (Criteria) this;
        }

        public Criteria andCBoolfield2EqualTo(Boolean value) {
            addCriterion("c_boolField2 =", value, "cBoolfield2");
            return (Criteria) this;
        }

        public Criteria andCBoolfield2NotEqualTo(Boolean value) {
            addCriterion("c_boolField2 <>", value, "cBoolfield2");
            return (Criteria) this;
        }

        public Criteria andCBoolfield2GreaterThan(Boolean value) {
            addCriterion("c_boolField2 >", value, "cBoolfield2");
            return (Criteria) this;
        }

        public Criteria andCBoolfield2GreaterThanOrEqualTo(Boolean value) {
            addCriterion("c_boolField2 >=", value, "cBoolfield2");
            return (Criteria) this;
        }

        public Criteria andCBoolfield2LessThan(Boolean value) {
            addCriterion("c_boolField2 <", value, "cBoolfield2");
            return (Criteria) this;
        }

        public Criteria andCBoolfield2LessThanOrEqualTo(Boolean value) {
            addCriterion("c_boolField2 <=", value, "cBoolfield2");
            return (Criteria) this;
        }

        public Criteria andCBoolfield2In(List<Boolean> values) {
            addCriterion("c_boolField2 in", values, "cBoolfield2");
            return (Criteria) this;
        }

        public Criteria andCBoolfield2NotIn(List<Boolean> values) {
            addCriterion("c_boolField2 not in", values, "cBoolfield2");
            return (Criteria) this;
        }

        public Criteria andCBoolfield2Between(Boolean value1, Boolean value2) {
            addCriterion("c_boolField2 between", value1, value2, "cBoolfield2");
            return (Criteria) this;
        }

        public Criteria andCBoolfield2NotBetween(Boolean value1, Boolean value2) {
            addCriterion("c_boolField2 not between", value1, value2, "cBoolfield2");
            return (Criteria) this;
        }
    }

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