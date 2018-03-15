package com.lllllw.hotel.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ServicesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServicesExample() {
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

        public Criteria andSeIdIsNull() {
            addCriterion("se_id is null");
            return (Criteria) this;
        }

        public Criteria andSeIdIsNotNull() {
            addCriterion("se_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeIdEqualTo(Integer value) {
            addCriterion("se_id =", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdNotEqualTo(Integer value) {
            addCriterion("se_id <>", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdGreaterThan(Integer value) {
            addCriterion("se_id >", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("se_id >=", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdLessThan(Integer value) {
            addCriterion("se_id <", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdLessThanOrEqualTo(Integer value) {
            addCriterion("se_id <=", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdIn(List<Integer> values) {
            addCriterion("se_id in", values, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdNotIn(List<Integer> values) {
            addCriterion("se_id not in", values, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdBetween(Integer value1, Integer value2) {
            addCriterion("se_id between", value1, value2, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("se_id not between", value1, value2, "seId");
            return (Criteria) this;
        }

        public Criteria andSeOidIsNull() {
            addCriterion("se_oid is null");
            return (Criteria) this;
        }

        public Criteria andSeOidIsNotNull() {
            addCriterion("se_oid is not null");
            return (Criteria) this;
        }

        public Criteria andSeOidEqualTo(Integer value) {
            addCriterion("se_oid =", value, "seOid");
            return (Criteria) this;
        }

        public Criteria andSeOidNotEqualTo(Integer value) {
            addCriterion("se_oid <>", value, "seOid");
            return (Criteria) this;
        }

        public Criteria andSeOidGreaterThan(Integer value) {
            addCriterion("se_oid >", value, "seOid");
            return (Criteria) this;
        }

        public Criteria andSeOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("se_oid >=", value, "seOid");
            return (Criteria) this;
        }

        public Criteria andSeOidLessThan(Integer value) {
            addCriterion("se_oid <", value, "seOid");
            return (Criteria) this;
        }

        public Criteria andSeOidLessThanOrEqualTo(Integer value) {
            addCriterion("se_oid <=", value, "seOid");
            return (Criteria) this;
        }

        public Criteria andSeOidIn(List<Integer> values) {
            addCriterion("se_oid in", values, "seOid");
            return (Criteria) this;
        }

        public Criteria andSeOidNotIn(List<Integer> values) {
            addCriterion("se_oid not in", values, "seOid");
            return (Criteria) this;
        }

        public Criteria andSeOidBetween(Integer value1, Integer value2) {
            addCriterion("se_oid between", value1, value2, "seOid");
            return (Criteria) this;
        }

        public Criteria andSeOidNotBetween(Integer value1, Integer value2) {
            addCriterion("se_oid not between", value1, value2, "seOid");
            return (Criteria) this;
        }

        public Criteria andSeTidIsNull() {
            addCriterion("se_tid is null");
            return (Criteria) this;
        }

        public Criteria andSeTidIsNotNull() {
            addCriterion("se_tid is not null");
            return (Criteria) this;
        }

        public Criteria andSeTidEqualTo(Integer value) {
            addCriterion("se_tid =", value, "seTid");
            return (Criteria) this;
        }

        public Criteria andSeTidNotEqualTo(Integer value) {
            addCriterion("se_tid <>", value, "seTid");
            return (Criteria) this;
        }

        public Criteria andSeTidGreaterThan(Integer value) {
            addCriterion("se_tid >", value, "seTid");
            return (Criteria) this;
        }

        public Criteria andSeTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("se_tid >=", value, "seTid");
            return (Criteria) this;
        }

        public Criteria andSeTidLessThan(Integer value) {
            addCriterion("se_tid <", value, "seTid");
            return (Criteria) this;
        }

        public Criteria andSeTidLessThanOrEqualTo(Integer value) {
            addCriterion("se_tid <=", value, "seTid");
            return (Criteria) this;
        }

        public Criteria andSeTidIn(List<Integer> values) {
            addCriterion("se_tid in", values, "seTid");
            return (Criteria) this;
        }

        public Criteria andSeTidNotIn(List<Integer> values) {
            addCriterion("se_tid not in", values, "seTid");
            return (Criteria) this;
        }

        public Criteria andSeTidBetween(Integer value1, Integer value2) {
            addCriterion("se_tid between", value1, value2, "seTid");
            return (Criteria) this;
        }

        public Criteria andSeTidNotBetween(Integer value1, Integer value2) {
            addCriterion("se_tid not between", value1, value2, "seTid");
            return (Criteria) this;
        }

        public Criteria andSeCreatedIsNull() {
            addCriterion("se_created is null");
            return (Criteria) this;
        }

        public Criteria andSeCreatedIsNotNull() {
            addCriterion("se_created is not null");
            return (Criteria) this;
        }

        public Criteria andSeCreatedEqualTo(Date value) {
            addCriterion("se_created =", value, "seCreated");
            return (Criteria) this;
        }

        public Criteria andSeCreatedNotEqualTo(Date value) {
            addCriterion("se_created <>", value, "seCreated");
            return (Criteria) this;
        }

        public Criteria andSeCreatedGreaterThan(Date value) {
            addCriterion("se_created >", value, "seCreated");
            return (Criteria) this;
        }

        public Criteria andSeCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("se_created >=", value, "seCreated");
            return (Criteria) this;
        }

        public Criteria andSeCreatedLessThan(Date value) {
            addCriterion("se_created <", value, "seCreated");
            return (Criteria) this;
        }

        public Criteria andSeCreatedLessThanOrEqualTo(Date value) {
            addCriterion("se_created <=", value, "seCreated");
            return (Criteria) this;
        }

        public Criteria andSeCreatedIn(List<Date> values) {
            addCriterion("se_created in", values, "seCreated");
            return (Criteria) this;
        }

        public Criteria andSeCreatedNotIn(List<Date> values) {
            addCriterion("se_created not in", values, "seCreated");
            return (Criteria) this;
        }

        public Criteria andSeCreatedBetween(Date value1, Date value2) {
            addCriterion("se_created between", value1, value2, "seCreated");
            return (Criteria) this;
        }

        public Criteria andSeCreatedNotBetween(Date value1, Date value2) {
            addCriterion("se_created not between", value1, value2, "seCreated");
            return (Criteria) this;
        }

        public Criteria andSeUpdatedIsNull() {
            addCriterion("se_updated is null");
            return (Criteria) this;
        }

        public Criteria andSeUpdatedIsNotNull() {
            addCriterion("se_updated is not null");
            return (Criteria) this;
        }

        public Criteria andSeUpdatedEqualTo(Date value) {
            addCriterion("se_updated =", value, "seUpdated");
            return (Criteria) this;
        }

        public Criteria andSeUpdatedNotEqualTo(Date value) {
            addCriterion("se_updated <>", value, "seUpdated");
            return (Criteria) this;
        }

        public Criteria andSeUpdatedGreaterThan(Date value) {
            addCriterion("se_updated >", value, "seUpdated");
            return (Criteria) this;
        }

        public Criteria andSeUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("se_updated >=", value, "seUpdated");
            return (Criteria) this;
        }

        public Criteria andSeUpdatedLessThan(Date value) {
            addCriterion("se_updated <", value, "seUpdated");
            return (Criteria) this;
        }

        public Criteria andSeUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("se_updated <=", value, "seUpdated");
            return (Criteria) this;
        }

        public Criteria andSeUpdatedIn(List<Date> values) {
            addCriterion("se_updated in", values, "seUpdated");
            return (Criteria) this;
        }

        public Criteria andSeUpdatedNotIn(List<Date> values) {
            addCriterion("se_updated not in", values, "seUpdated");
            return (Criteria) this;
        }

        public Criteria andSeUpdatedBetween(Date value1, Date value2) {
            addCriterion("se_updated between", value1, value2, "seUpdated");
            return (Criteria) this;
        }

        public Criteria andSeUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("se_updated not between", value1, value2, "seUpdated");
            return (Criteria) this;
        }

        public Criteria andSeOrderIsNull() {
            addCriterion("se_order is null");
            return (Criteria) this;
        }

        public Criteria andSeOrderIsNotNull() {
            addCriterion("se_order is not null");
            return (Criteria) this;
        }

        public Criteria andSeOrderEqualTo(String value) {
            addCriterion("se_order =", value, "seOrder");
            return (Criteria) this;
        }

        public Criteria andSeOrderNotEqualTo(String value) {
            addCriterion("se_order <>", value, "seOrder");
            return (Criteria) this;
        }

        public Criteria andSeOrderGreaterThan(String value) {
            addCriterion("se_order >", value, "seOrder");
            return (Criteria) this;
        }

        public Criteria andSeOrderGreaterThanOrEqualTo(String value) {
            addCriterion("se_order >=", value, "seOrder");
            return (Criteria) this;
        }

        public Criteria andSeOrderLessThan(String value) {
            addCriterion("se_order <", value, "seOrder");
            return (Criteria) this;
        }

        public Criteria andSeOrderLessThanOrEqualTo(String value) {
            addCriterion("se_order <=", value, "seOrder");
            return (Criteria) this;
        }

        public Criteria andSeOrderLike(String value) {
            addCriterion("se_order like", value, "seOrder");
            return (Criteria) this;
        }

        public Criteria andSeOrderNotLike(String value) {
            addCriterion("se_order not like", value, "seOrder");
            return (Criteria) this;
        }

        public Criteria andSeOrderIn(List<String> values) {
            addCriterion("se_order in", values, "seOrder");
            return (Criteria) this;
        }

        public Criteria andSeOrderNotIn(List<String> values) {
            addCriterion("se_order not in", values, "seOrder");
            return (Criteria) this;
        }

        public Criteria andSeOrderBetween(String value1, String value2) {
            addCriterion("se_order between", value1, value2, "seOrder");
            return (Criteria) this;
        }

        public Criteria andSeOrderNotBetween(String value1, String value2) {
            addCriterion("se_order not between", value1, value2, "seOrder");
            return (Criteria) this;
        }

        public Criteria andSeOtimeIsNull() {
            addCriterion("se_otime is null");
            return (Criteria) this;
        }

        public Criteria andSeOtimeIsNotNull() {
            addCriterion("se_otime is not null");
            return (Criteria) this;
        }

        public Criteria andSeOtimeEqualTo(Date value) {
            addCriterion("se_otime =", value, "seOtime");
            return (Criteria) this;
        }

        public Criteria andSeOtimeNotEqualTo(Date value) {
            addCriterion("se_otime <>", value, "seOtime");
            return (Criteria) this;
        }

        public Criteria andSeOtimeGreaterThan(Date value) {
            addCriterion("se_otime >", value, "seOtime");
            return (Criteria) this;
        }

        public Criteria andSeOtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("se_otime >=", value, "seOtime");
            return (Criteria) this;
        }

        public Criteria andSeOtimeLessThan(Date value) {
            addCriterion("se_otime <", value, "seOtime");
            return (Criteria) this;
        }

        public Criteria andSeOtimeLessThanOrEqualTo(Date value) {
            addCriterion("se_otime <=", value, "seOtime");
            return (Criteria) this;
        }

        public Criteria andSeOtimeIn(List<Date> values) {
            addCriterion("se_otime in", values, "seOtime");
            return (Criteria) this;
        }

        public Criteria andSeOtimeNotIn(List<Date> values) {
            addCriterion("se_otime not in", values, "seOtime");
            return (Criteria) this;
        }

        public Criteria andSeOtimeBetween(Date value1, Date value2) {
            addCriterion("se_otime between", value1, value2, "seOtime");
            return (Criteria) this;
        }

        public Criteria andSeOtimeNotBetween(Date value1, Date value2) {
            addCriterion("se_otime not between", value1, value2, "seOtime");
            return (Criteria) this;
        }

        public Criteria andSeStatusIsNull() {
            addCriterion("se_status is null");
            return (Criteria) this;
        }

        public Criteria andSeStatusIsNotNull() {
            addCriterion("se_status is not null");
            return (Criteria) this;
        }

        public Criteria andSeStatusEqualTo(Boolean value) {
            addCriterion("se_status =", value, "seStatus");
            return (Criteria) this;
        }

        public Criteria andSeStatusNotEqualTo(Boolean value) {
            addCriterion("se_status <>", value, "seStatus");
            return (Criteria) this;
        }

        public Criteria andSeStatusGreaterThan(Boolean value) {
            addCriterion("se_status >", value, "seStatus");
            return (Criteria) this;
        }

        public Criteria andSeStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("se_status >=", value, "seStatus");
            return (Criteria) this;
        }

        public Criteria andSeStatusLessThan(Boolean value) {
            addCriterion("se_status <", value, "seStatus");
            return (Criteria) this;
        }

        public Criteria andSeStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("se_status <=", value, "seStatus");
            return (Criteria) this;
        }

        public Criteria andSeStatusIn(List<Boolean> values) {
            addCriterion("se_status in", values, "seStatus");
            return (Criteria) this;
        }

        public Criteria andSeStatusNotIn(List<Boolean> values) {
            addCriterion("se_status not in", values, "seStatus");
            return (Criteria) this;
        }

        public Criteria andSeStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("se_status between", value1, value2, "seStatus");
            return (Criteria) this;
        }

        public Criteria andSeStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("se_status not between", value1, value2, "seStatus");
            return (Criteria) this;
        }

        public Criteria andSeRemarksIsNull() {
            addCriterion("se_remarks is null");
            return (Criteria) this;
        }

        public Criteria andSeRemarksIsNotNull() {
            addCriterion("se_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andSeRemarksEqualTo(String value) {
            addCriterion("se_remarks =", value, "seRemarks");
            return (Criteria) this;
        }

        public Criteria andSeRemarksNotEqualTo(String value) {
            addCriterion("se_remarks <>", value, "seRemarks");
            return (Criteria) this;
        }

        public Criteria andSeRemarksGreaterThan(String value) {
            addCriterion("se_remarks >", value, "seRemarks");
            return (Criteria) this;
        }

        public Criteria andSeRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("se_remarks >=", value, "seRemarks");
            return (Criteria) this;
        }

        public Criteria andSeRemarksLessThan(String value) {
            addCriterion("se_remarks <", value, "seRemarks");
            return (Criteria) this;
        }

        public Criteria andSeRemarksLessThanOrEqualTo(String value) {
            addCriterion("se_remarks <=", value, "seRemarks");
            return (Criteria) this;
        }

        public Criteria andSeRemarksLike(String value) {
            addCriterion("se_remarks like", value, "seRemarks");
            return (Criteria) this;
        }

        public Criteria andSeRemarksNotLike(String value) {
            addCriterion("se_remarks not like", value, "seRemarks");
            return (Criteria) this;
        }

        public Criteria andSeRemarksIn(List<String> values) {
            addCriterion("se_remarks in", values, "seRemarks");
            return (Criteria) this;
        }

        public Criteria andSeRemarksNotIn(List<String> values) {
            addCriterion("se_remarks not in", values, "seRemarks");
            return (Criteria) this;
        }

        public Criteria andSeRemarksBetween(String value1, String value2) {
            addCriterion("se_remarks between", value1, value2, "seRemarks");
            return (Criteria) this;
        }

        public Criteria andSeRemarksNotBetween(String value1, String value2) {
            addCriterion("se_remarks not between", value1, value2, "seRemarks");
            return (Criteria) this;
        }

        public Criteria andSeIntfield1IsNull() {
            addCriterion("se_intField1 is null");
            return (Criteria) this;
        }

        public Criteria andSeIntfield1IsNotNull() {
            addCriterion("se_intField1 is not null");
            return (Criteria) this;
        }

        public Criteria andSeIntfield1EqualTo(Integer value) {
            addCriterion("se_intField1 =", value, "seIntfield1");
            return (Criteria) this;
        }

        public Criteria andSeIntfield1NotEqualTo(Integer value) {
            addCriterion("se_intField1 <>", value, "seIntfield1");
            return (Criteria) this;
        }

        public Criteria andSeIntfield1GreaterThan(Integer value) {
            addCriterion("se_intField1 >", value, "seIntfield1");
            return (Criteria) this;
        }

        public Criteria andSeIntfield1GreaterThanOrEqualTo(Integer value) {
            addCriterion("se_intField1 >=", value, "seIntfield1");
            return (Criteria) this;
        }

        public Criteria andSeIntfield1LessThan(Integer value) {
            addCriterion("se_intField1 <", value, "seIntfield1");
            return (Criteria) this;
        }

        public Criteria andSeIntfield1LessThanOrEqualTo(Integer value) {
            addCriterion("se_intField1 <=", value, "seIntfield1");
            return (Criteria) this;
        }

        public Criteria andSeIntfield1In(List<Integer> values) {
            addCriterion("se_intField1 in", values, "seIntfield1");
            return (Criteria) this;
        }

        public Criteria andSeIntfield1NotIn(List<Integer> values) {
            addCriterion("se_intField1 not in", values, "seIntfield1");
            return (Criteria) this;
        }

        public Criteria andSeIntfield1Between(Integer value1, Integer value2) {
            addCriterion("se_intField1 between", value1, value2, "seIntfield1");
            return (Criteria) this;
        }

        public Criteria andSeIntfield1NotBetween(Integer value1, Integer value2) {
            addCriterion("se_intField1 not between", value1, value2, "seIntfield1");
            return (Criteria) this;
        }

        public Criteria andSeIntfield2IsNull() {
            addCriterion("se_intField2 is null");
            return (Criteria) this;
        }

        public Criteria andSeIntfield2IsNotNull() {
            addCriterion("se_intField2 is not null");
            return (Criteria) this;
        }

        public Criteria andSeIntfield2EqualTo(Integer value) {
            addCriterion("se_intField2 =", value, "seIntfield2");
            return (Criteria) this;
        }

        public Criteria andSeIntfield2NotEqualTo(Integer value) {
            addCriterion("se_intField2 <>", value, "seIntfield2");
            return (Criteria) this;
        }

        public Criteria andSeIntfield2GreaterThan(Integer value) {
            addCriterion("se_intField2 >", value, "seIntfield2");
            return (Criteria) this;
        }

        public Criteria andSeIntfield2GreaterThanOrEqualTo(Integer value) {
            addCriterion("se_intField2 >=", value, "seIntfield2");
            return (Criteria) this;
        }

        public Criteria andSeIntfield2LessThan(Integer value) {
            addCriterion("se_intField2 <", value, "seIntfield2");
            return (Criteria) this;
        }

        public Criteria andSeIntfield2LessThanOrEqualTo(Integer value) {
            addCriterion("se_intField2 <=", value, "seIntfield2");
            return (Criteria) this;
        }

        public Criteria andSeIntfield2In(List<Integer> values) {
            addCriterion("se_intField2 in", values, "seIntfield2");
            return (Criteria) this;
        }

        public Criteria andSeIntfield2NotIn(List<Integer> values) {
            addCriterion("se_intField2 not in", values, "seIntfield2");
            return (Criteria) this;
        }

        public Criteria andSeIntfield2Between(Integer value1, Integer value2) {
            addCriterion("se_intField2 between", value1, value2, "seIntfield2");
            return (Criteria) this;
        }

        public Criteria andSeIntfield2NotBetween(Integer value1, Integer value2) {
            addCriterion("se_intField2 not between", value1, value2, "seIntfield2");
            return (Criteria) this;
        }

        public Criteria andSeStringfield1IsNull() {
            addCriterion("se_stringField1 is null");
            return (Criteria) this;
        }

        public Criteria andSeStringfield1IsNotNull() {
            addCriterion("se_stringField1 is not null");
            return (Criteria) this;
        }

        public Criteria andSeStringfield1EqualTo(String value) {
            addCriterion("se_stringField1 =", value, "seStringfield1");
            return (Criteria) this;
        }

        public Criteria andSeStringfield1NotEqualTo(String value) {
            addCriterion("se_stringField1 <>", value, "seStringfield1");
            return (Criteria) this;
        }

        public Criteria andSeStringfield1GreaterThan(String value) {
            addCriterion("se_stringField1 >", value, "seStringfield1");
            return (Criteria) this;
        }

        public Criteria andSeStringfield1GreaterThanOrEqualTo(String value) {
            addCriterion("se_stringField1 >=", value, "seStringfield1");
            return (Criteria) this;
        }

        public Criteria andSeStringfield1LessThan(String value) {
            addCriterion("se_stringField1 <", value, "seStringfield1");
            return (Criteria) this;
        }

        public Criteria andSeStringfield1LessThanOrEqualTo(String value) {
            addCriterion("se_stringField1 <=", value, "seStringfield1");
            return (Criteria) this;
        }

        public Criteria andSeStringfield1Like(String value) {
            addCriterion("se_stringField1 like", value, "seStringfield1");
            return (Criteria) this;
        }

        public Criteria andSeStringfield1NotLike(String value) {
            addCriterion("se_stringField1 not like", value, "seStringfield1");
            return (Criteria) this;
        }

        public Criteria andSeStringfield1In(List<String> values) {
            addCriterion("se_stringField1 in", values, "seStringfield1");
            return (Criteria) this;
        }

        public Criteria andSeStringfield1NotIn(List<String> values) {
            addCriterion("se_stringField1 not in", values, "seStringfield1");
            return (Criteria) this;
        }

        public Criteria andSeStringfield1Between(String value1, String value2) {
            addCriterion("se_stringField1 between", value1, value2, "seStringfield1");
            return (Criteria) this;
        }

        public Criteria andSeStringfield1NotBetween(String value1, String value2) {
            addCriterion("se_stringField1 not between", value1, value2, "seStringfield1");
            return (Criteria) this;
        }

        public Criteria andSeStringfield2IsNull() {
            addCriterion("se_stringField2 is null");
            return (Criteria) this;
        }

        public Criteria andSeStringfield2IsNotNull() {
            addCriterion("se_stringField2 is not null");
            return (Criteria) this;
        }

        public Criteria andSeStringfield2EqualTo(String value) {
            addCriterion("se_stringField2 =", value, "seStringfield2");
            return (Criteria) this;
        }

        public Criteria andSeStringfield2NotEqualTo(String value) {
            addCriterion("se_stringField2 <>", value, "seStringfield2");
            return (Criteria) this;
        }

        public Criteria andSeStringfield2GreaterThan(String value) {
            addCriterion("se_stringField2 >", value, "seStringfield2");
            return (Criteria) this;
        }

        public Criteria andSeStringfield2GreaterThanOrEqualTo(String value) {
            addCriterion("se_stringField2 >=", value, "seStringfield2");
            return (Criteria) this;
        }

        public Criteria andSeStringfield2LessThan(String value) {
            addCriterion("se_stringField2 <", value, "seStringfield2");
            return (Criteria) this;
        }

        public Criteria andSeStringfield2LessThanOrEqualTo(String value) {
            addCriterion("se_stringField2 <=", value, "seStringfield2");
            return (Criteria) this;
        }

        public Criteria andSeStringfield2Like(String value) {
            addCriterion("se_stringField2 like", value, "seStringfield2");
            return (Criteria) this;
        }

        public Criteria andSeStringfield2NotLike(String value) {
            addCriterion("se_stringField2 not like", value, "seStringfield2");
            return (Criteria) this;
        }

        public Criteria andSeStringfield2In(List<String> values) {
            addCriterion("se_stringField2 in", values, "seStringfield2");
            return (Criteria) this;
        }

        public Criteria andSeStringfield2NotIn(List<String> values) {
            addCriterion("se_stringField2 not in", values, "seStringfield2");
            return (Criteria) this;
        }

        public Criteria andSeStringfield2Between(String value1, String value2) {
            addCriterion("se_stringField2 between", value1, value2, "seStringfield2");
            return (Criteria) this;
        }

        public Criteria andSeStringfield2NotBetween(String value1, String value2) {
            addCriterion("se_stringField2 not between", value1, value2, "seStringfield2");
            return (Criteria) this;
        }

        public Criteria andSeDatefield1IsNull() {
            addCriterion("se_dateField1 is null");
            return (Criteria) this;
        }

        public Criteria andSeDatefield1IsNotNull() {
            addCriterion("se_dateField1 is not null");
            return (Criteria) this;
        }

        public Criteria andSeDatefield1EqualTo(Date value) {
            addCriterionForJDBCDate("se_dateField1 =", value, "seDatefield1");
            return (Criteria) this;
        }

        public Criteria andSeDatefield1NotEqualTo(Date value) {
            addCriterionForJDBCDate("se_dateField1 <>", value, "seDatefield1");
            return (Criteria) this;
        }

        public Criteria andSeDatefield1GreaterThan(Date value) {
            addCriterionForJDBCDate("se_dateField1 >", value, "seDatefield1");
            return (Criteria) this;
        }

        public Criteria andSeDatefield1GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("se_dateField1 >=", value, "seDatefield1");
            return (Criteria) this;
        }

        public Criteria andSeDatefield1LessThan(Date value) {
            addCriterionForJDBCDate("se_dateField1 <", value, "seDatefield1");
            return (Criteria) this;
        }

        public Criteria andSeDatefield1LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("se_dateField1 <=", value, "seDatefield1");
            return (Criteria) this;
        }

        public Criteria andSeDatefield1In(List<Date> values) {
            addCriterionForJDBCDate("se_dateField1 in", values, "seDatefield1");
            return (Criteria) this;
        }

        public Criteria andSeDatefield1NotIn(List<Date> values) {
            addCriterionForJDBCDate("se_dateField1 not in", values, "seDatefield1");
            return (Criteria) this;
        }

        public Criteria andSeDatefield1Between(Date value1, Date value2) {
            addCriterionForJDBCDate("se_dateField1 between", value1, value2, "seDatefield1");
            return (Criteria) this;
        }

        public Criteria andSeDatefield1NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("se_dateField1 not between", value1, value2, "seDatefield1");
            return (Criteria) this;
        }

        public Criteria andSeDatefield2IsNull() {
            addCriterion("se_dateField2 is null");
            return (Criteria) this;
        }

        public Criteria andSeDatefield2IsNotNull() {
            addCriterion("se_dateField2 is not null");
            return (Criteria) this;
        }

        public Criteria andSeDatefield2EqualTo(Date value) {
            addCriterionForJDBCDate("se_dateField2 =", value, "seDatefield2");
            return (Criteria) this;
        }

        public Criteria andSeDatefield2NotEqualTo(Date value) {
            addCriterionForJDBCDate("se_dateField2 <>", value, "seDatefield2");
            return (Criteria) this;
        }

        public Criteria andSeDatefield2GreaterThan(Date value) {
            addCriterionForJDBCDate("se_dateField2 >", value, "seDatefield2");
            return (Criteria) this;
        }

        public Criteria andSeDatefield2GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("se_dateField2 >=", value, "seDatefield2");
            return (Criteria) this;
        }

        public Criteria andSeDatefield2LessThan(Date value) {
            addCriterionForJDBCDate("se_dateField2 <", value, "seDatefield2");
            return (Criteria) this;
        }

        public Criteria andSeDatefield2LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("se_dateField2 <=", value, "seDatefield2");
            return (Criteria) this;
        }

        public Criteria andSeDatefield2In(List<Date> values) {
            addCriterionForJDBCDate("se_dateField2 in", values, "seDatefield2");
            return (Criteria) this;
        }

        public Criteria andSeDatefield2NotIn(List<Date> values) {
            addCriterionForJDBCDate("se_dateField2 not in", values, "seDatefield2");
            return (Criteria) this;
        }

        public Criteria andSeDatefield2Between(Date value1, Date value2) {
            addCriterionForJDBCDate("se_dateField2 between", value1, value2, "seDatefield2");
            return (Criteria) this;
        }

        public Criteria andSeDatefield2NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("se_dateField2 not between", value1, value2, "seDatefield2");
            return (Criteria) this;
        }

        public Criteria andSeDatetimefield1IsNull() {
            addCriterion("se_datetimeField1 is null");
            return (Criteria) this;
        }

        public Criteria andSeDatetimefield1IsNotNull() {
            addCriterion("se_datetimeField1 is not null");
            return (Criteria) this;
        }

        public Criteria andSeDatetimefield1EqualTo(Date value) {
            addCriterion("se_datetimeField1 =", value, "seDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andSeDatetimefield1NotEqualTo(Date value) {
            addCriterion("se_datetimeField1 <>", value, "seDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andSeDatetimefield1GreaterThan(Date value) {
            addCriterion("se_datetimeField1 >", value, "seDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andSeDatetimefield1GreaterThanOrEqualTo(Date value) {
            addCriterion("se_datetimeField1 >=", value, "seDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andSeDatetimefield1LessThan(Date value) {
            addCriterion("se_datetimeField1 <", value, "seDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andSeDatetimefield1LessThanOrEqualTo(Date value) {
            addCriterion("se_datetimeField1 <=", value, "seDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andSeDatetimefield1In(List<Date> values) {
            addCriterion("se_datetimeField1 in", values, "seDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andSeDatetimefield1NotIn(List<Date> values) {
            addCriterion("se_datetimeField1 not in", values, "seDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andSeDatetimefield1Between(Date value1, Date value2) {
            addCriterion("se_datetimeField1 between", value1, value2, "seDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andSeDatetimefield1NotBetween(Date value1, Date value2) {
            addCriterion("se_datetimeField1 not between", value1, value2, "seDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andSeDatetimefield2IsNull() {
            addCriterion("se_datetimeField2 is null");
            return (Criteria) this;
        }

        public Criteria andSeDatetimefield2IsNotNull() {
            addCriterion("se_datetimeField2 is not null");
            return (Criteria) this;
        }

        public Criteria andSeDatetimefield2EqualTo(Date value) {
            addCriterion("se_datetimeField2 =", value, "seDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andSeDatetimefield2NotEqualTo(Date value) {
            addCriterion("se_datetimeField2 <>", value, "seDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andSeDatetimefield2GreaterThan(Date value) {
            addCriterion("se_datetimeField2 >", value, "seDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andSeDatetimefield2GreaterThanOrEqualTo(Date value) {
            addCriterion("se_datetimeField2 >=", value, "seDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andSeDatetimefield2LessThan(Date value) {
            addCriterion("se_datetimeField2 <", value, "seDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andSeDatetimefield2LessThanOrEqualTo(Date value) {
            addCriterion("se_datetimeField2 <=", value, "seDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andSeDatetimefield2In(List<Date> values) {
            addCriterion("se_datetimeField2 in", values, "seDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andSeDatetimefield2NotIn(List<Date> values) {
            addCriterion("se_datetimeField2 not in", values, "seDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andSeDatetimefield2Between(Date value1, Date value2) {
            addCriterion("se_datetimeField2 between", value1, value2, "seDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andSeDatetimefield2NotBetween(Date value1, Date value2) {
            addCriterion("se_datetimeField2 not between", value1, value2, "seDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andSeBooleanfield1IsNull() {
            addCriterion("se_booleanField1 is null");
            return (Criteria) this;
        }

        public Criteria andSeBooleanfield1IsNotNull() {
            addCriterion("se_booleanField1 is not null");
            return (Criteria) this;
        }

        public Criteria andSeBooleanfield1EqualTo(Boolean value) {
            addCriterion("se_booleanField1 =", value, "seBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andSeBooleanfield1NotEqualTo(Boolean value) {
            addCriterion("se_booleanField1 <>", value, "seBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andSeBooleanfield1GreaterThan(Boolean value) {
            addCriterion("se_booleanField1 >", value, "seBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andSeBooleanfield1GreaterThanOrEqualTo(Boolean value) {
            addCriterion("se_booleanField1 >=", value, "seBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andSeBooleanfield1LessThan(Boolean value) {
            addCriterion("se_booleanField1 <", value, "seBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andSeBooleanfield1LessThanOrEqualTo(Boolean value) {
            addCriterion("se_booleanField1 <=", value, "seBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andSeBooleanfield1In(List<Boolean> values) {
            addCriterion("se_booleanField1 in", values, "seBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andSeBooleanfield1NotIn(List<Boolean> values) {
            addCriterion("se_booleanField1 not in", values, "seBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andSeBooleanfield1Between(Boolean value1, Boolean value2) {
            addCriterion("se_booleanField1 between", value1, value2, "seBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andSeBooleanfield1NotBetween(Boolean value1, Boolean value2) {
            addCriterion("se_booleanField1 not between", value1, value2, "seBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andSeBooleanfield2IsNull() {
            addCriterion("se_booleanField2 is null");
            return (Criteria) this;
        }

        public Criteria andSeBooleanfield2IsNotNull() {
            addCriterion("se_booleanField2 is not null");
            return (Criteria) this;
        }

        public Criteria andSeBooleanfield2EqualTo(Boolean value) {
            addCriterion("se_booleanField2 =", value, "seBooleanfield2");
            return (Criteria) this;
        }

        public Criteria andSeBooleanfield2NotEqualTo(Boolean value) {
            addCriterion("se_booleanField2 <>", value, "seBooleanfield2");
            return (Criteria) this;
        }

        public Criteria andSeBooleanfield2GreaterThan(Boolean value) {
            addCriterion("se_booleanField2 >", value, "seBooleanfield2");
            return (Criteria) this;
        }

        public Criteria andSeBooleanfield2GreaterThanOrEqualTo(Boolean value) {
            addCriterion("se_booleanField2 >=", value, "seBooleanfield2");
            return (Criteria) this;
        }

        public Criteria andSeBooleanfield2LessThan(Boolean value) {
            addCriterion("se_booleanField2 <", value, "seBooleanfield2");
            return (Criteria) this;
        }

        public Criteria andSeBooleanfield2LessThanOrEqualTo(Boolean value) {
            addCriterion("se_booleanField2 <=", value, "seBooleanfield2");
            return (Criteria) this;
        }

        public Criteria andSeBooleanfield2In(List<Boolean> values) {
            addCriterion("se_booleanField2 in", values, "seBooleanfield2");
            return (Criteria) this;
        }

        public Criteria andSeBooleanfield2NotIn(List<Boolean> values) {
            addCriterion("se_booleanField2 not in", values, "seBooleanfield2");
            return (Criteria) this;
        }

        public Criteria andSeBooleanfield2Between(Boolean value1, Boolean value2) {
            addCriterion("se_booleanField2 between", value1, value2, "seBooleanfield2");
            return (Criteria) this;
        }

        public Criteria andSeBooleanfield2NotBetween(Boolean value1, Boolean value2) {
            addCriterion("se_booleanField2 not between", value1, value2, "seBooleanfield2");
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