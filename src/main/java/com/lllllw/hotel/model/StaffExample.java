package com.lllllw.hotel.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
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

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Integer value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Integer value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Integer value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Integer value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Integer> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Integer> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Integer value1, Integer value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSCodeIsNull() {
            addCriterion("s_code is null");
            return (Criteria) this;
        }

        public Criteria andSCodeIsNotNull() {
            addCriterion("s_code is not null");
            return (Criteria) this;
        }

        public Criteria andSCodeEqualTo(String value) {
            addCriterion("s_code =", value, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeNotEqualTo(String value) {
            addCriterion("s_code <>", value, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeGreaterThan(String value) {
            addCriterion("s_code >", value, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeGreaterThanOrEqualTo(String value) {
            addCriterion("s_code >=", value, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeLessThan(String value) {
            addCriterion("s_code <", value, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeLessThanOrEqualTo(String value) {
            addCriterion("s_code <=", value, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeLike(String value) {
            addCriterion("s_code like", value, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeNotLike(String value) {
            addCriterion("s_code not like", value, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeIn(List<String> values) {
            addCriterion("s_code in", values, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeNotIn(List<String> values) {
            addCriterion("s_code not in", values, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeBetween(String value1, String value2) {
            addCriterion("s_code between", value1, value2, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeNotBetween(String value1, String value2) {
            addCriterion("s_code not between", value1, value2, "sCode");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("s_name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("s_name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("s_name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("s_name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("s_name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("s_name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSPsswordIsNull() {
            addCriterion("s_pssword is null");
            return (Criteria) this;
        }

        public Criteria andSPsswordIsNotNull() {
            addCriterion("s_pssword is not null");
            return (Criteria) this;
        }

        public Criteria andSPsswordEqualTo(String value) {
            addCriterion("s_pssword =", value, "sPssword");
            return (Criteria) this;
        }

        public Criteria andSPsswordNotEqualTo(String value) {
            addCriterion("s_pssword <>", value, "sPssword");
            return (Criteria) this;
        }

        public Criteria andSPsswordGreaterThan(String value) {
            addCriterion("s_pssword >", value, "sPssword");
            return (Criteria) this;
        }

        public Criteria andSPsswordGreaterThanOrEqualTo(String value) {
            addCriterion("s_pssword >=", value, "sPssword");
            return (Criteria) this;
        }

        public Criteria andSPsswordLessThan(String value) {
            addCriterion("s_pssword <", value, "sPssword");
            return (Criteria) this;
        }

        public Criteria andSPsswordLessThanOrEqualTo(String value) {
            addCriterion("s_pssword <=", value, "sPssword");
            return (Criteria) this;
        }

        public Criteria andSPsswordLike(String value) {
            addCriterion("s_pssword like", value, "sPssword");
            return (Criteria) this;
        }

        public Criteria andSPsswordNotLike(String value) {
            addCriterion("s_pssword not like", value, "sPssword");
            return (Criteria) this;
        }

        public Criteria andSPsswordIn(List<String> values) {
            addCriterion("s_pssword in", values, "sPssword");
            return (Criteria) this;
        }

        public Criteria andSPsswordNotIn(List<String> values) {
            addCriterion("s_pssword not in", values, "sPssword");
            return (Criteria) this;
        }

        public Criteria andSPsswordBetween(String value1, String value2) {
            addCriterion("s_pssword between", value1, value2, "sPssword");
            return (Criteria) this;
        }

        public Criteria andSPsswordNotBetween(String value1, String value2) {
            addCriterion("s_pssword not between", value1, value2, "sPssword");
            return (Criteria) this;
        }

        public Criteria andSGenderIsNull() {
            addCriterion("s_gender is null");
            return (Criteria) this;
        }

        public Criteria andSGenderIsNotNull() {
            addCriterion("s_gender is not null");
            return (Criteria) this;
        }

        public Criteria andSGenderEqualTo(String value) {
            addCriterion("s_gender =", value, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderNotEqualTo(String value) {
            addCriterion("s_gender <>", value, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderGreaterThan(String value) {
            addCriterion("s_gender >", value, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderGreaterThanOrEqualTo(String value) {
            addCriterion("s_gender >=", value, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderLessThan(String value) {
            addCriterion("s_gender <", value, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderLessThanOrEqualTo(String value) {
            addCriterion("s_gender <=", value, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderLike(String value) {
            addCriterion("s_gender like", value, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderNotLike(String value) {
            addCriterion("s_gender not like", value, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderIn(List<String> values) {
            addCriterion("s_gender in", values, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderNotIn(List<String> values) {
            addCriterion("s_gender not in", values, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderBetween(String value1, String value2) {
            addCriterion("s_gender between", value1, value2, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderNotBetween(String value1, String value2) {
            addCriterion("s_gender not between", value1, value2, "sGender");
            return (Criteria) this;
        }

        public Criteria andSJobIsNull() {
            addCriterion("s_job is null");
            return (Criteria) this;
        }

        public Criteria andSJobIsNotNull() {
            addCriterion("s_job is not null");
            return (Criteria) this;
        }

        public Criteria andSJobEqualTo(String value) {
            addCriterion("s_job =", value, "sJob");
            return (Criteria) this;
        }

        public Criteria andSJobNotEqualTo(String value) {
            addCriterion("s_job <>", value, "sJob");
            return (Criteria) this;
        }

        public Criteria andSJobGreaterThan(String value) {
            addCriterion("s_job >", value, "sJob");
            return (Criteria) this;
        }

        public Criteria andSJobGreaterThanOrEqualTo(String value) {
            addCriterion("s_job >=", value, "sJob");
            return (Criteria) this;
        }

        public Criteria andSJobLessThan(String value) {
            addCriterion("s_job <", value, "sJob");
            return (Criteria) this;
        }

        public Criteria andSJobLessThanOrEqualTo(String value) {
            addCriterion("s_job <=", value, "sJob");
            return (Criteria) this;
        }

        public Criteria andSJobLike(String value) {
            addCriterion("s_job like", value, "sJob");
            return (Criteria) this;
        }

        public Criteria andSJobNotLike(String value) {
            addCriterion("s_job not like", value, "sJob");
            return (Criteria) this;
        }

        public Criteria andSJobIn(List<String> values) {
            addCriterion("s_job in", values, "sJob");
            return (Criteria) this;
        }

        public Criteria andSJobNotIn(List<String> values) {
            addCriterion("s_job not in", values, "sJob");
            return (Criteria) this;
        }

        public Criteria andSJobBetween(String value1, String value2) {
            addCriterion("s_job between", value1, value2, "sJob");
            return (Criteria) this;
        }

        public Criteria andSJobNotBetween(String value1, String value2) {
            addCriterion("s_job not between", value1, value2, "sJob");
            return (Criteria) this;
        }

        public Criteria andSPermissionIsNull() {
            addCriterion("s_permission is null");
            return (Criteria) this;
        }

        public Criteria andSPermissionIsNotNull() {
            addCriterion("s_permission is not null");
            return (Criteria) this;
        }

        public Criteria andSPermissionEqualTo(Integer value) {
            addCriterion("s_permission =", value, "sPermission");
            return (Criteria) this;
        }

        public Criteria andSPermissionNotEqualTo(Integer value) {
            addCriterion("s_permission <>", value, "sPermission");
            return (Criteria) this;
        }

        public Criteria andSPermissionGreaterThan(Integer value) {
            addCriterion("s_permission >", value, "sPermission");
            return (Criteria) this;
        }

        public Criteria andSPermissionGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_permission >=", value, "sPermission");
            return (Criteria) this;
        }

        public Criteria andSPermissionLessThan(Integer value) {
            addCriterion("s_permission <", value, "sPermission");
            return (Criteria) this;
        }

        public Criteria andSPermissionLessThanOrEqualTo(Integer value) {
            addCriterion("s_permission <=", value, "sPermission");
            return (Criteria) this;
        }

        public Criteria andSPermissionIn(List<Integer> values) {
            addCriterion("s_permission in", values, "sPermission");
            return (Criteria) this;
        }

        public Criteria andSPermissionNotIn(List<Integer> values) {
            addCriterion("s_permission not in", values, "sPermission");
            return (Criteria) this;
        }

        public Criteria andSPermissionBetween(Integer value1, Integer value2) {
            addCriterion("s_permission between", value1, value2, "sPermission");
            return (Criteria) this;
        }

        public Criteria andSPermissionNotBetween(Integer value1, Integer value2) {
            addCriterion("s_permission not between", value1, value2, "sPermission");
            return (Criteria) this;
        }

        public Criteria andSRemarksIsNull() {
            addCriterion("s_remarks is null");
            return (Criteria) this;
        }

        public Criteria andSRemarksIsNotNull() {
            addCriterion("s_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andSRemarksEqualTo(String value) {
            addCriterion("s_remarks =", value, "sRemarks");
            return (Criteria) this;
        }

        public Criteria andSRemarksNotEqualTo(String value) {
            addCriterion("s_remarks <>", value, "sRemarks");
            return (Criteria) this;
        }

        public Criteria andSRemarksGreaterThan(String value) {
            addCriterion("s_remarks >", value, "sRemarks");
            return (Criteria) this;
        }

        public Criteria andSRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("s_remarks >=", value, "sRemarks");
            return (Criteria) this;
        }

        public Criteria andSRemarksLessThan(String value) {
            addCriterion("s_remarks <", value, "sRemarks");
            return (Criteria) this;
        }

        public Criteria andSRemarksLessThanOrEqualTo(String value) {
            addCriterion("s_remarks <=", value, "sRemarks");
            return (Criteria) this;
        }

        public Criteria andSRemarksLike(String value) {
            addCriterion("s_remarks like", value, "sRemarks");
            return (Criteria) this;
        }

        public Criteria andSRemarksNotLike(String value) {
            addCriterion("s_remarks not like", value, "sRemarks");
            return (Criteria) this;
        }

        public Criteria andSRemarksIn(List<String> values) {
            addCriterion("s_remarks in", values, "sRemarks");
            return (Criteria) this;
        }

        public Criteria andSRemarksNotIn(List<String> values) {
            addCriterion("s_remarks not in", values, "sRemarks");
            return (Criteria) this;
        }

        public Criteria andSRemarksBetween(String value1, String value2) {
            addCriterion("s_remarks between", value1, value2, "sRemarks");
            return (Criteria) this;
        }

        public Criteria andSRemarksNotBetween(String value1, String value2) {
            addCriterion("s_remarks not between", value1, value2, "sRemarks");
            return (Criteria) this;
        }

        public Criteria andSCreatedIsNull() {
            addCriterion("s_created is null");
            return (Criteria) this;
        }

        public Criteria andSCreatedIsNotNull() {
            addCriterion("s_created is not null");
            return (Criteria) this;
        }

        public Criteria andSCreatedEqualTo(Date value) {
            addCriterion("s_created =", value, "sCreated");
            return (Criteria) this;
        }

        public Criteria andSCreatedNotEqualTo(Date value) {
            addCriterion("s_created <>", value, "sCreated");
            return (Criteria) this;
        }

        public Criteria andSCreatedGreaterThan(Date value) {
            addCriterion("s_created >", value, "sCreated");
            return (Criteria) this;
        }

        public Criteria andSCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("s_created >=", value, "sCreated");
            return (Criteria) this;
        }

        public Criteria andSCreatedLessThan(Date value) {
            addCriterion("s_created <", value, "sCreated");
            return (Criteria) this;
        }

        public Criteria andSCreatedLessThanOrEqualTo(Date value) {
            addCriterion("s_created <=", value, "sCreated");
            return (Criteria) this;
        }

        public Criteria andSCreatedIn(List<Date> values) {
            addCriterion("s_created in", values, "sCreated");
            return (Criteria) this;
        }

        public Criteria andSCreatedNotIn(List<Date> values) {
            addCriterion("s_created not in", values, "sCreated");
            return (Criteria) this;
        }

        public Criteria andSCreatedBetween(Date value1, Date value2) {
            addCriterion("s_created between", value1, value2, "sCreated");
            return (Criteria) this;
        }

        public Criteria andSCreatedNotBetween(Date value1, Date value2) {
            addCriterion("s_created not between", value1, value2, "sCreated");
            return (Criteria) this;
        }

        public Criteria andSUpdatedIsNull() {
            addCriterion("s_updated is null");
            return (Criteria) this;
        }

        public Criteria andSUpdatedIsNotNull() {
            addCriterion("s_updated is not null");
            return (Criteria) this;
        }

        public Criteria andSUpdatedEqualTo(Date value) {
            addCriterion("s_updated =", value, "sUpdated");
            return (Criteria) this;
        }

        public Criteria andSUpdatedNotEqualTo(Date value) {
            addCriterion("s_updated <>", value, "sUpdated");
            return (Criteria) this;
        }

        public Criteria andSUpdatedGreaterThan(Date value) {
            addCriterion("s_updated >", value, "sUpdated");
            return (Criteria) this;
        }

        public Criteria andSUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("s_updated >=", value, "sUpdated");
            return (Criteria) this;
        }

        public Criteria andSUpdatedLessThan(Date value) {
            addCriterion("s_updated <", value, "sUpdated");
            return (Criteria) this;
        }

        public Criteria andSUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("s_updated <=", value, "sUpdated");
            return (Criteria) this;
        }

        public Criteria andSUpdatedIn(List<Date> values) {
            addCriterion("s_updated in", values, "sUpdated");
            return (Criteria) this;
        }

        public Criteria andSUpdatedNotIn(List<Date> values) {
            addCriterion("s_updated not in", values, "sUpdated");
            return (Criteria) this;
        }

        public Criteria andSUpdatedBetween(Date value1, Date value2) {
            addCriterion("s_updated between", value1, value2, "sUpdated");
            return (Criteria) this;
        }

        public Criteria andSUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("s_updated not between", value1, value2, "sUpdated");
            return (Criteria) this;
        }

        public Criteria andSIntfield1IsNull() {
            addCriterion("s_intField1 is null");
            return (Criteria) this;
        }

        public Criteria andSIntfield1IsNotNull() {
            addCriterion("s_intField1 is not null");
            return (Criteria) this;
        }

        public Criteria andSIntfield1EqualTo(Integer value) {
            addCriterion("s_intField1 =", value, "sIntfield1");
            return (Criteria) this;
        }

        public Criteria andSIntfield1NotEqualTo(Integer value) {
            addCriterion("s_intField1 <>", value, "sIntfield1");
            return (Criteria) this;
        }

        public Criteria andSIntfield1GreaterThan(Integer value) {
            addCriterion("s_intField1 >", value, "sIntfield1");
            return (Criteria) this;
        }

        public Criteria andSIntfield1GreaterThanOrEqualTo(Integer value) {
            addCriterion("s_intField1 >=", value, "sIntfield1");
            return (Criteria) this;
        }

        public Criteria andSIntfield1LessThan(Integer value) {
            addCriterion("s_intField1 <", value, "sIntfield1");
            return (Criteria) this;
        }

        public Criteria andSIntfield1LessThanOrEqualTo(Integer value) {
            addCriterion("s_intField1 <=", value, "sIntfield1");
            return (Criteria) this;
        }

        public Criteria andSIntfield1In(List<Integer> values) {
            addCriterion("s_intField1 in", values, "sIntfield1");
            return (Criteria) this;
        }

        public Criteria andSIntfield1NotIn(List<Integer> values) {
            addCriterion("s_intField1 not in", values, "sIntfield1");
            return (Criteria) this;
        }

        public Criteria andSIntfield1Between(Integer value1, Integer value2) {
            addCriterion("s_intField1 between", value1, value2, "sIntfield1");
            return (Criteria) this;
        }

        public Criteria andSIntfield1NotBetween(Integer value1, Integer value2) {
            addCriterion("s_intField1 not between", value1, value2, "sIntfield1");
            return (Criteria) this;
        }

        public Criteria andSIntfield2IsNull() {
            addCriterion("s_intField2 is null");
            return (Criteria) this;
        }

        public Criteria andSIntfield2IsNotNull() {
            addCriterion("s_intField2 is not null");
            return (Criteria) this;
        }

        public Criteria andSIntfield2EqualTo(Integer value) {
            addCriterion("s_intField2 =", value, "sIntfield2");
            return (Criteria) this;
        }

        public Criteria andSIntfield2NotEqualTo(Integer value) {
            addCriterion("s_intField2 <>", value, "sIntfield2");
            return (Criteria) this;
        }

        public Criteria andSIntfield2GreaterThan(Integer value) {
            addCriterion("s_intField2 >", value, "sIntfield2");
            return (Criteria) this;
        }

        public Criteria andSIntfield2GreaterThanOrEqualTo(Integer value) {
            addCriterion("s_intField2 >=", value, "sIntfield2");
            return (Criteria) this;
        }

        public Criteria andSIntfield2LessThan(Integer value) {
            addCriterion("s_intField2 <", value, "sIntfield2");
            return (Criteria) this;
        }

        public Criteria andSIntfield2LessThanOrEqualTo(Integer value) {
            addCriterion("s_intField2 <=", value, "sIntfield2");
            return (Criteria) this;
        }

        public Criteria andSIntfield2In(List<Integer> values) {
            addCriterion("s_intField2 in", values, "sIntfield2");
            return (Criteria) this;
        }

        public Criteria andSIntfield2NotIn(List<Integer> values) {
            addCriterion("s_intField2 not in", values, "sIntfield2");
            return (Criteria) this;
        }

        public Criteria andSIntfield2Between(Integer value1, Integer value2) {
            addCriterion("s_intField2 between", value1, value2, "sIntfield2");
            return (Criteria) this;
        }

        public Criteria andSIntfield2NotBetween(Integer value1, Integer value2) {
            addCriterion("s_intField2 not between", value1, value2, "sIntfield2");
            return (Criteria) this;
        }

        public Criteria andSStringfield1IsNull() {
            addCriterion("s_stringField1 is null");
            return (Criteria) this;
        }

        public Criteria andSStringfield1IsNotNull() {
            addCriterion("s_stringField1 is not null");
            return (Criteria) this;
        }

        public Criteria andSStringfield1EqualTo(String value) {
            addCriterion("s_stringField1 =", value, "sStringfield1");
            return (Criteria) this;
        }

        public Criteria andSStringfield1NotEqualTo(String value) {
            addCriterion("s_stringField1 <>", value, "sStringfield1");
            return (Criteria) this;
        }

        public Criteria andSStringfield1GreaterThan(String value) {
            addCriterion("s_stringField1 >", value, "sStringfield1");
            return (Criteria) this;
        }

        public Criteria andSStringfield1GreaterThanOrEqualTo(String value) {
            addCriterion("s_stringField1 >=", value, "sStringfield1");
            return (Criteria) this;
        }

        public Criteria andSStringfield1LessThan(String value) {
            addCriterion("s_stringField1 <", value, "sStringfield1");
            return (Criteria) this;
        }

        public Criteria andSStringfield1LessThanOrEqualTo(String value) {
            addCriterion("s_stringField1 <=", value, "sStringfield1");
            return (Criteria) this;
        }

        public Criteria andSStringfield1Like(String value) {
            addCriterion("s_stringField1 like", value, "sStringfield1");
            return (Criteria) this;
        }

        public Criteria andSStringfield1NotLike(String value) {
            addCriterion("s_stringField1 not like", value, "sStringfield1");
            return (Criteria) this;
        }

        public Criteria andSStringfield1In(List<String> values) {
            addCriterion("s_stringField1 in", values, "sStringfield1");
            return (Criteria) this;
        }

        public Criteria andSStringfield1NotIn(List<String> values) {
            addCriterion("s_stringField1 not in", values, "sStringfield1");
            return (Criteria) this;
        }

        public Criteria andSStringfield1Between(String value1, String value2) {
            addCriterion("s_stringField1 between", value1, value2, "sStringfield1");
            return (Criteria) this;
        }

        public Criteria andSStringfield1NotBetween(String value1, String value2) {
            addCriterion("s_stringField1 not between", value1, value2, "sStringfield1");
            return (Criteria) this;
        }

        public Criteria andSStringfield2IsNull() {
            addCriterion("s_stringField2 is null");
            return (Criteria) this;
        }

        public Criteria andSStringfield2IsNotNull() {
            addCriterion("s_stringField2 is not null");
            return (Criteria) this;
        }

        public Criteria andSStringfield2EqualTo(String value) {
            addCriterion("s_stringField2 =", value, "sStringfield2");
            return (Criteria) this;
        }

        public Criteria andSStringfield2NotEqualTo(String value) {
            addCriterion("s_stringField2 <>", value, "sStringfield2");
            return (Criteria) this;
        }

        public Criteria andSStringfield2GreaterThan(String value) {
            addCriterion("s_stringField2 >", value, "sStringfield2");
            return (Criteria) this;
        }

        public Criteria andSStringfield2GreaterThanOrEqualTo(String value) {
            addCriterion("s_stringField2 >=", value, "sStringfield2");
            return (Criteria) this;
        }

        public Criteria andSStringfield2LessThan(String value) {
            addCriterion("s_stringField2 <", value, "sStringfield2");
            return (Criteria) this;
        }

        public Criteria andSStringfield2LessThanOrEqualTo(String value) {
            addCriterion("s_stringField2 <=", value, "sStringfield2");
            return (Criteria) this;
        }

        public Criteria andSStringfield2Like(String value) {
            addCriterion("s_stringField2 like", value, "sStringfield2");
            return (Criteria) this;
        }

        public Criteria andSStringfield2NotLike(String value) {
            addCriterion("s_stringField2 not like", value, "sStringfield2");
            return (Criteria) this;
        }

        public Criteria andSStringfield2In(List<String> values) {
            addCriterion("s_stringField2 in", values, "sStringfield2");
            return (Criteria) this;
        }

        public Criteria andSStringfield2NotIn(List<String> values) {
            addCriterion("s_stringField2 not in", values, "sStringfield2");
            return (Criteria) this;
        }

        public Criteria andSStringfield2Between(String value1, String value2) {
            addCriterion("s_stringField2 between", value1, value2, "sStringfield2");
            return (Criteria) this;
        }

        public Criteria andSStringfield2NotBetween(String value1, String value2) {
            addCriterion("s_stringField2 not between", value1, value2, "sStringfield2");
            return (Criteria) this;
        }

        public Criteria andSDatefield1IsNull() {
            addCriterion("s_dateField1 is null");
            return (Criteria) this;
        }

        public Criteria andSDatefield1IsNotNull() {
            addCriterion("s_dateField1 is not null");
            return (Criteria) this;
        }

        public Criteria andSDatefield1EqualTo(Date value) {
            addCriterionForJDBCDate("s_dateField1 =", value, "sDatefield1");
            return (Criteria) this;
        }

        public Criteria andSDatefield1NotEqualTo(Date value) {
            addCriterionForJDBCDate("s_dateField1 <>", value, "sDatefield1");
            return (Criteria) this;
        }

        public Criteria andSDatefield1GreaterThan(Date value) {
            addCriterionForJDBCDate("s_dateField1 >", value, "sDatefield1");
            return (Criteria) this;
        }

        public Criteria andSDatefield1GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("s_dateField1 >=", value, "sDatefield1");
            return (Criteria) this;
        }

        public Criteria andSDatefield1LessThan(Date value) {
            addCriterionForJDBCDate("s_dateField1 <", value, "sDatefield1");
            return (Criteria) this;
        }

        public Criteria andSDatefield1LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("s_dateField1 <=", value, "sDatefield1");
            return (Criteria) this;
        }

        public Criteria andSDatefield1In(List<Date> values) {
            addCriterionForJDBCDate("s_dateField1 in", values, "sDatefield1");
            return (Criteria) this;
        }

        public Criteria andSDatefield1NotIn(List<Date> values) {
            addCriterionForJDBCDate("s_dateField1 not in", values, "sDatefield1");
            return (Criteria) this;
        }

        public Criteria andSDatefield1Between(Date value1, Date value2) {
            addCriterionForJDBCDate("s_dateField1 between", value1, value2, "sDatefield1");
            return (Criteria) this;
        }

        public Criteria andSDatefield1NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("s_dateField1 not between", value1, value2, "sDatefield1");
            return (Criteria) this;
        }

        public Criteria andSDatefield2IsNull() {
            addCriterion("s_dateField2 is null");
            return (Criteria) this;
        }

        public Criteria andSDatefield2IsNotNull() {
            addCriterion("s_dateField2 is not null");
            return (Criteria) this;
        }

        public Criteria andSDatefield2EqualTo(Date value) {
            addCriterionForJDBCDate("s_dateField2 =", value, "sDatefield2");
            return (Criteria) this;
        }

        public Criteria andSDatefield2NotEqualTo(Date value) {
            addCriterionForJDBCDate("s_dateField2 <>", value, "sDatefield2");
            return (Criteria) this;
        }

        public Criteria andSDatefield2GreaterThan(Date value) {
            addCriterionForJDBCDate("s_dateField2 >", value, "sDatefield2");
            return (Criteria) this;
        }

        public Criteria andSDatefield2GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("s_dateField2 >=", value, "sDatefield2");
            return (Criteria) this;
        }

        public Criteria andSDatefield2LessThan(Date value) {
            addCriterionForJDBCDate("s_dateField2 <", value, "sDatefield2");
            return (Criteria) this;
        }

        public Criteria andSDatefield2LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("s_dateField2 <=", value, "sDatefield2");
            return (Criteria) this;
        }

        public Criteria andSDatefield2In(List<Date> values) {
            addCriterionForJDBCDate("s_dateField2 in", values, "sDatefield2");
            return (Criteria) this;
        }

        public Criteria andSDatefield2NotIn(List<Date> values) {
            addCriterionForJDBCDate("s_dateField2 not in", values, "sDatefield2");
            return (Criteria) this;
        }

        public Criteria andSDatefield2Between(Date value1, Date value2) {
            addCriterionForJDBCDate("s_dateField2 between", value1, value2, "sDatefield2");
            return (Criteria) this;
        }

        public Criteria andSDatefield2NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("s_dateField2 not between", value1, value2, "sDatefield2");
            return (Criteria) this;
        }

        public Criteria andSDatetimefield1IsNull() {
            addCriterion("s_datetimeField1 is null");
            return (Criteria) this;
        }

        public Criteria andSDatetimefield1IsNotNull() {
            addCriterion("s_datetimeField1 is not null");
            return (Criteria) this;
        }

        public Criteria andSDatetimefield1EqualTo(Date value) {
            addCriterion("s_datetimeField1 =", value, "sDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andSDatetimefield1NotEqualTo(Date value) {
            addCriterion("s_datetimeField1 <>", value, "sDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andSDatetimefield1GreaterThan(Date value) {
            addCriterion("s_datetimeField1 >", value, "sDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andSDatetimefield1GreaterThanOrEqualTo(Date value) {
            addCriterion("s_datetimeField1 >=", value, "sDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andSDatetimefield1LessThan(Date value) {
            addCriterion("s_datetimeField1 <", value, "sDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andSDatetimefield1LessThanOrEqualTo(Date value) {
            addCriterion("s_datetimeField1 <=", value, "sDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andSDatetimefield1In(List<Date> values) {
            addCriterion("s_datetimeField1 in", values, "sDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andSDatetimefield1NotIn(List<Date> values) {
            addCriterion("s_datetimeField1 not in", values, "sDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andSDatetimefield1Between(Date value1, Date value2) {
            addCriterion("s_datetimeField1 between", value1, value2, "sDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andSDatetimefield1NotBetween(Date value1, Date value2) {
            addCriterion("s_datetimeField1 not between", value1, value2, "sDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andSDatetimefield2IsNull() {
            addCriterion("s_datetimeField2 is null");
            return (Criteria) this;
        }

        public Criteria andSDatetimefield2IsNotNull() {
            addCriterion("s_datetimeField2 is not null");
            return (Criteria) this;
        }

        public Criteria andSDatetimefield2EqualTo(Date value) {
            addCriterion("s_datetimeField2 =", value, "sDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andSDatetimefield2NotEqualTo(Date value) {
            addCriterion("s_datetimeField2 <>", value, "sDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andSDatetimefield2GreaterThan(Date value) {
            addCriterion("s_datetimeField2 >", value, "sDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andSDatetimefield2GreaterThanOrEqualTo(Date value) {
            addCriterion("s_datetimeField2 >=", value, "sDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andSDatetimefield2LessThan(Date value) {
            addCriterion("s_datetimeField2 <", value, "sDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andSDatetimefield2LessThanOrEqualTo(Date value) {
            addCriterion("s_datetimeField2 <=", value, "sDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andSDatetimefield2In(List<Date> values) {
            addCriterion("s_datetimeField2 in", values, "sDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andSDatetimefield2NotIn(List<Date> values) {
            addCriterion("s_datetimeField2 not in", values, "sDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andSDatetimefield2Between(Date value1, Date value2) {
            addCriterion("s_datetimeField2 between", value1, value2, "sDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andSDatetimefield2NotBetween(Date value1, Date value2) {
            addCriterion("s_datetimeField2 not between", value1, value2, "sDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andSBooleanfield1IsNull() {
            addCriterion("s_booleanField1 is null");
            return (Criteria) this;
        }

        public Criteria andSBooleanfield1IsNotNull() {
            addCriterion("s_booleanField1 is not null");
            return (Criteria) this;
        }

        public Criteria andSBooleanfield1EqualTo(Boolean value) {
            addCriterion("s_booleanField1 =", value, "sBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andSBooleanfield1NotEqualTo(Boolean value) {
            addCriterion("s_booleanField1 <>", value, "sBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andSBooleanfield1GreaterThan(Boolean value) {
            addCriterion("s_booleanField1 >", value, "sBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andSBooleanfield1GreaterThanOrEqualTo(Boolean value) {
            addCriterion("s_booleanField1 >=", value, "sBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andSBooleanfield1LessThan(Boolean value) {
            addCriterion("s_booleanField1 <", value, "sBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andSBooleanfield1LessThanOrEqualTo(Boolean value) {
            addCriterion("s_booleanField1 <=", value, "sBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andSBooleanfield1In(List<Boolean> values) {
            addCriterion("s_booleanField1 in", values, "sBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andSBooleanfield1NotIn(List<Boolean> values) {
            addCriterion("s_booleanField1 not in", values, "sBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andSBooleanfield1Between(Boolean value1, Boolean value2) {
            addCriterion("s_booleanField1 between", value1, value2, "sBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andSBooleanfield1NotBetween(Boolean value1, Boolean value2) {
            addCriterion("s_booleanField1 not between", value1, value2, "sBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andSBooleanfield2IsNull() {
            addCriterion("s_booleanField2 is null");
            return (Criteria) this;
        }

        public Criteria andSBooleanfield2IsNotNull() {
            addCriterion("s_booleanField2 is not null");
            return (Criteria) this;
        }

        public Criteria andSBooleanfield2EqualTo(Boolean value) {
            addCriterion("s_booleanField2 =", value, "sBooleanfield2");
            return (Criteria) this;
        }

        public Criteria andSBooleanfield2NotEqualTo(Boolean value) {
            addCriterion("s_booleanField2 <>", value, "sBooleanfield2");
            return (Criteria) this;
        }

        public Criteria andSBooleanfield2GreaterThan(Boolean value) {
            addCriterion("s_booleanField2 >", value, "sBooleanfield2");
            return (Criteria) this;
        }

        public Criteria andSBooleanfield2GreaterThanOrEqualTo(Boolean value) {
            addCriterion("s_booleanField2 >=", value, "sBooleanfield2");
            return (Criteria) this;
        }

        public Criteria andSBooleanfield2LessThan(Boolean value) {
            addCriterion("s_booleanField2 <", value, "sBooleanfield2");
            return (Criteria) this;
        }

        public Criteria andSBooleanfield2LessThanOrEqualTo(Boolean value) {
            addCriterion("s_booleanField2 <=", value, "sBooleanfield2");
            return (Criteria) this;
        }

        public Criteria andSBooleanfield2In(List<Boolean> values) {
            addCriterion("s_booleanField2 in", values, "sBooleanfield2");
            return (Criteria) this;
        }

        public Criteria andSBooleanfield2NotIn(List<Boolean> values) {
            addCriterion("s_booleanField2 not in", values, "sBooleanfield2");
            return (Criteria) this;
        }

        public Criteria andSBooleanfield2Between(Boolean value1, Boolean value2) {
            addCriterion("s_booleanField2 between", value1, value2, "sBooleanfield2");
            return (Criteria) this;
        }

        public Criteria andSBooleanfield2NotBetween(Boolean value1, Boolean value2) {
            addCriterion("s_booleanField2 not between", value1, value2, "sBooleanfield2");
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