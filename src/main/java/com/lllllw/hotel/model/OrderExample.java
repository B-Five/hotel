package com.lllllw.hotel.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOIdIsNull() {
            addCriterion("o_id is null");
            return (Criteria) this;
        }

        public Criteria andOIdIsNotNull() {
            addCriterion("o_id is not null");
            return (Criteria) this;
        }

        public Criteria andOIdEqualTo(Integer value) {
            addCriterion("o_id =", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotEqualTo(Integer value) {
            addCriterion("o_id <>", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThan(Integer value) {
            addCriterion("o_id >", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_id >=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThan(Integer value) {
            addCriterion("o_id <", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThanOrEqualTo(Integer value) {
            addCriterion("o_id <=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdIn(List<Integer> values) {
            addCriterion("o_id in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotIn(List<Integer> values) {
            addCriterion("o_id not in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdBetween(Integer value1, Integer value2) {
            addCriterion("o_id between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotBetween(Integer value1, Integer value2) {
            addCriterion("o_id not between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOUidIsNull() {
            addCriterion("o_uid is null");
            return (Criteria) this;
        }

        public Criteria andOUidIsNotNull() {
            addCriterion("o_uid is not null");
            return (Criteria) this;
        }

        public Criteria andOUidEqualTo(Integer value) {
            addCriterion("o_uid =", value, "oUid");
            return (Criteria) this;
        }

        public Criteria andOUidNotEqualTo(Integer value) {
            addCriterion("o_uid <>", value, "oUid");
            return (Criteria) this;
        }

        public Criteria andOUidGreaterThan(Integer value) {
            addCriterion("o_uid >", value, "oUid");
            return (Criteria) this;
        }

        public Criteria andOUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_uid >=", value, "oUid");
            return (Criteria) this;
        }

        public Criteria andOUidLessThan(Integer value) {
            addCriterion("o_uid <", value, "oUid");
            return (Criteria) this;
        }

        public Criteria andOUidLessThanOrEqualTo(Integer value) {
            addCriterion("o_uid <=", value, "oUid");
            return (Criteria) this;
        }

        public Criteria andOUidIn(List<Integer> values) {
            addCriterion("o_uid in", values, "oUid");
            return (Criteria) this;
        }

        public Criteria andOUidNotIn(List<Integer> values) {
            addCriterion("o_uid not in", values, "oUid");
            return (Criteria) this;
        }

        public Criteria andOUidBetween(Integer value1, Integer value2) {
            addCriterion("o_uid between", value1, value2, "oUid");
            return (Criteria) this;
        }

        public Criteria andOUidNotBetween(Integer value1, Integer value2) {
            addCriterion("o_uid not between", value1, value2, "oUid");
            return (Criteria) this;
        }

        public Criteria andORidIsNull() {
            addCriterion("o_rid is null");
            return (Criteria) this;
        }

        public Criteria andORidIsNotNull() {
            addCriterion("o_rid is not null");
            return (Criteria) this;
        }

        public Criteria andORidEqualTo(Integer value) {
            addCriterion("o_rid =", value, "oRid");
            return (Criteria) this;
        }

        public Criteria andORidNotEqualTo(Integer value) {
            addCriterion("o_rid <>", value, "oRid");
            return (Criteria) this;
        }

        public Criteria andORidGreaterThan(Integer value) {
            addCriterion("o_rid >", value, "oRid");
            return (Criteria) this;
        }

        public Criteria andORidGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_rid >=", value, "oRid");
            return (Criteria) this;
        }

        public Criteria andORidLessThan(Integer value) {
            addCriterion("o_rid <", value, "oRid");
            return (Criteria) this;
        }

        public Criteria andORidLessThanOrEqualTo(Integer value) {
            addCriterion("o_rid <=", value, "oRid");
            return (Criteria) this;
        }

        public Criteria andORidIn(List<Integer> values) {
            addCriterion("o_rid in", values, "oRid");
            return (Criteria) this;
        }

        public Criteria andORidNotIn(List<Integer> values) {
            addCriterion("o_rid not in", values, "oRid");
            return (Criteria) this;
        }

        public Criteria andORidBetween(Integer value1, Integer value2) {
            addCriterion("o_rid between", value1, value2, "oRid");
            return (Criteria) this;
        }

        public Criteria andORidNotBetween(Integer value1, Integer value2) {
            addCriterion("o_rid not between", value1, value2, "oRid");
            return (Criteria) this;
        }

        public Criteria andOCheckintimeIsNull() {
            addCriterion("o_checkinTime is null");
            return (Criteria) this;
        }

        public Criteria andOCheckintimeIsNotNull() {
            addCriterion("o_checkinTime is not null");
            return (Criteria) this;
        }

        public Criteria andOCheckintimeEqualTo(Date value) {
            addCriterion("o_checkinTime =", value, "oCheckintime");
            return (Criteria) this;
        }

        public Criteria andOCheckintimeNotEqualTo(Date value) {
            addCriterion("o_checkinTime <>", value, "oCheckintime");
            return (Criteria) this;
        }

        public Criteria andOCheckintimeGreaterThan(Date value) {
            addCriterion("o_checkinTime >", value, "oCheckintime");
            return (Criteria) this;
        }

        public Criteria andOCheckintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("o_checkinTime >=", value, "oCheckintime");
            return (Criteria) this;
        }

        public Criteria andOCheckintimeLessThan(Date value) {
            addCriterion("o_checkinTime <", value, "oCheckintime");
            return (Criteria) this;
        }

        public Criteria andOCheckintimeLessThanOrEqualTo(Date value) {
            addCriterion("o_checkinTime <=", value, "oCheckintime");
            return (Criteria) this;
        }

        public Criteria andOCheckintimeIn(List<Date> values) {
            addCriterion("o_checkinTime in", values, "oCheckintime");
            return (Criteria) this;
        }

        public Criteria andOCheckintimeNotIn(List<Date> values) {
            addCriterion("o_checkinTime not in", values, "oCheckintime");
            return (Criteria) this;
        }

        public Criteria andOCheckintimeBetween(Date value1, Date value2) {
            addCriterion("o_checkinTime between", value1, value2, "oCheckintime");
            return (Criteria) this;
        }

        public Criteria andOCheckintimeNotBetween(Date value1, Date value2) {
            addCriterion("o_checkinTime not between", value1, value2, "oCheckintime");
            return (Criteria) this;
        }

        public Criteria andOCheckouttimeIsNull() {
            addCriterion("o_checkoutTime is null");
            return (Criteria) this;
        }

        public Criteria andOCheckouttimeIsNotNull() {
            addCriterion("o_checkoutTime is not null");
            return (Criteria) this;
        }

        public Criteria andOCheckouttimeEqualTo(Date value) {
            addCriterion("o_checkoutTime =", value, "oCheckouttime");
            return (Criteria) this;
        }

        public Criteria andOCheckouttimeNotEqualTo(Date value) {
            addCriterion("o_checkoutTime <>", value, "oCheckouttime");
            return (Criteria) this;
        }

        public Criteria andOCheckouttimeGreaterThan(Date value) {
            addCriterion("o_checkoutTime >", value, "oCheckouttime");
            return (Criteria) this;
        }

        public Criteria andOCheckouttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("o_checkoutTime >=", value, "oCheckouttime");
            return (Criteria) this;
        }

        public Criteria andOCheckouttimeLessThan(Date value) {
            addCriterion("o_checkoutTime <", value, "oCheckouttime");
            return (Criteria) this;
        }

        public Criteria andOCheckouttimeLessThanOrEqualTo(Date value) {
            addCriterion("o_checkoutTime <=", value, "oCheckouttime");
            return (Criteria) this;
        }

        public Criteria andOCheckouttimeIn(List<Date> values) {
            addCriterion("o_checkoutTime in", values, "oCheckouttime");
            return (Criteria) this;
        }

        public Criteria andOCheckouttimeNotIn(List<Date> values) {
            addCriterion("o_checkoutTime not in", values, "oCheckouttime");
            return (Criteria) this;
        }

        public Criteria andOCheckouttimeBetween(Date value1, Date value2) {
            addCriterion("o_checkoutTime between", value1, value2, "oCheckouttime");
            return (Criteria) this;
        }

        public Criteria andOCheckouttimeNotBetween(Date value1, Date value2) {
            addCriterion("o_checkoutTime not between", value1, value2, "oCheckouttime");
            return (Criteria) this;
        }

        public Criteria andODepositIsNull() {
            addCriterion("o_deposit is null");
            return (Criteria) this;
        }

        public Criteria andODepositIsNotNull() {
            addCriterion("o_deposit is not null");
            return (Criteria) this;
        }

        public Criteria andODepositEqualTo(Double value) {
            addCriterion("o_deposit =", value, "oDeposit");
            return (Criteria) this;
        }

        public Criteria andODepositNotEqualTo(Double value) {
            addCriterion("o_deposit <>", value, "oDeposit");
            return (Criteria) this;
        }

        public Criteria andODepositGreaterThan(Double value) {
            addCriterion("o_deposit >", value, "oDeposit");
            return (Criteria) this;
        }

        public Criteria andODepositGreaterThanOrEqualTo(Double value) {
            addCriterion("o_deposit >=", value, "oDeposit");
            return (Criteria) this;
        }

        public Criteria andODepositLessThan(Double value) {
            addCriterion("o_deposit <", value, "oDeposit");
            return (Criteria) this;
        }

        public Criteria andODepositLessThanOrEqualTo(Double value) {
            addCriterion("o_deposit <=", value, "oDeposit");
            return (Criteria) this;
        }

        public Criteria andODepositIn(List<Double> values) {
            addCriterion("o_deposit in", values, "oDeposit");
            return (Criteria) this;
        }

        public Criteria andODepositNotIn(List<Double> values) {
            addCriterion("o_deposit not in", values, "oDeposit");
            return (Criteria) this;
        }

        public Criteria andODepositBetween(Double value1, Double value2) {
            addCriterion("o_deposit between", value1, value2, "oDeposit");
            return (Criteria) this;
        }

        public Criteria andODepositNotBetween(Double value1, Double value2) {
            addCriterion("o_deposit not between", value1, value2, "oDeposit");
            return (Criteria) this;
        }

        public Criteria andOPriceIsNull() {
            addCriterion("o_price is null");
            return (Criteria) this;
        }

        public Criteria andOPriceIsNotNull() {
            addCriterion("o_price is not null");
            return (Criteria) this;
        }

        public Criteria andOPriceEqualTo(Double value) {
            addCriterion("o_price =", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceNotEqualTo(Double value) {
            addCriterion("o_price <>", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceGreaterThan(Double value) {
            addCriterion("o_price >", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("o_price >=", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceLessThan(Double value) {
            addCriterion("o_price <", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceLessThanOrEqualTo(Double value) {
            addCriterion("o_price <=", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceIn(List<Double> values) {
            addCriterion("o_price in", values, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceNotIn(List<Double> values) {
            addCriterion("o_price not in", values, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceBetween(Double value1, Double value2) {
            addCriterion("o_price between", value1, value2, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceNotBetween(Double value1, Double value2) {
            addCriterion("o_price not between", value1, value2, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOStatusIsNull() {
            addCriterion("o_status is null");
            return (Criteria) this;
        }

        public Criteria andOStatusIsNotNull() {
            addCriterion("o_status is not null");
            return (Criteria) this;
        }

        public Criteria andOStatusEqualTo(Boolean value) {
            addCriterion("o_status =", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotEqualTo(Boolean value) {
            addCriterion("o_status <>", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusGreaterThan(Boolean value) {
            addCriterion("o_status >", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("o_status >=", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusLessThan(Boolean value) {
            addCriterion("o_status <", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("o_status <=", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusIn(List<Boolean> values) {
            addCriterion("o_status in", values, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotIn(List<Boolean> values) {
            addCriterion("o_status not in", values, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("o_status between", value1, value2, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("o_status not between", value1, value2, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOCreatedIsNull() {
            addCriterion("o_created is null");
            return (Criteria) this;
        }

        public Criteria andOCreatedIsNotNull() {
            addCriterion("o_created is not null");
            return (Criteria) this;
        }

        public Criteria andOCreatedEqualTo(Date value) {
            addCriterion("o_created =", value, "oCreated");
            return (Criteria) this;
        }

        public Criteria andOCreatedNotEqualTo(Date value) {
            addCriterion("o_created <>", value, "oCreated");
            return (Criteria) this;
        }

        public Criteria andOCreatedGreaterThan(Date value) {
            addCriterion("o_created >", value, "oCreated");
            return (Criteria) this;
        }

        public Criteria andOCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("o_created >=", value, "oCreated");
            return (Criteria) this;
        }

        public Criteria andOCreatedLessThan(Date value) {
            addCriterion("o_created <", value, "oCreated");
            return (Criteria) this;
        }

        public Criteria andOCreatedLessThanOrEqualTo(Date value) {
            addCriterion("o_created <=", value, "oCreated");
            return (Criteria) this;
        }

        public Criteria andOCreatedIn(List<Date> values) {
            addCriterion("o_created in", values, "oCreated");
            return (Criteria) this;
        }

        public Criteria andOCreatedNotIn(List<Date> values) {
            addCriterion("o_created not in", values, "oCreated");
            return (Criteria) this;
        }

        public Criteria andOCreatedBetween(Date value1, Date value2) {
            addCriterion("o_created between", value1, value2, "oCreated");
            return (Criteria) this;
        }

        public Criteria andOCreatedNotBetween(Date value1, Date value2) {
            addCriterion("o_created not between", value1, value2, "oCreated");
            return (Criteria) this;
        }

        public Criteria andOUpdatedIsNull() {
            addCriterion("o_updated is null");
            return (Criteria) this;
        }

        public Criteria andOUpdatedIsNotNull() {
            addCriterion("o_updated is not null");
            return (Criteria) this;
        }

        public Criteria andOUpdatedEqualTo(Date value) {
            addCriterion("o_updated =", value, "oUpdated");
            return (Criteria) this;
        }

        public Criteria andOUpdatedNotEqualTo(Date value) {
            addCriterion("o_updated <>", value, "oUpdated");
            return (Criteria) this;
        }

        public Criteria andOUpdatedGreaterThan(Date value) {
            addCriterion("o_updated >", value, "oUpdated");
            return (Criteria) this;
        }

        public Criteria andOUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("o_updated >=", value, "oUpdated");
            return (Criteria) this;
        }

        public Criteria andOUpdatedLessThan(Date value) {
            addCriterion("o_updated <", value, "oUpdated");
            return (Criteria) this;
        }

        public Criteria andOUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("o_updated <=", value, "oUpdated");
            return (Criteria) this;
        }

        public Criteria andOUpdatedIn(List<Date> values) {
            addCriterion("o_updated in", values, "oUpdated");
            return (Criteria) this;
        }

        public Criteria andOUpdatedNotIn(List<Date> values) {
            addCriterion("o_updated not in", values, "oUpdated");
            return (Criteria) this;
        }

        public Criteria andOUpdatedBetween(Date value1, Date value2) {
            addCriterion("o_updated between", value1, value2, "oUpdated");
            return (Criteria) this;
        }

        public Criteria andOUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("o_updated not between", value1, value2, "oUpdated");
            return (Criteria) this;
        }

        public Criteria andOIntfield1IsNull() {
            addCriterion("o_intField1 is null");
            return (Criteria) this;
        }

        public Criteria andOIntfield1IsNotNull() {
            addCriterion("o_intField1 is not null");
            return (Criteria) this;
        }

        public Criteria andOIntfield1EqualTo(String value) {
            addCriterion("o_intField1 =", value, "oIntfield1");
            return (Criteria) this;
        }

        public Criteria andOIntfield1NotEqualTo(String value) {
            addCriterion("o_intField1 <>", value, "oIntfield1");
            return (Criteria) this;
        }

        public Criteria andOIntfield1GreaterThan(String value) {
            addCriterion("o_intField1 >", value, "oIntfield1");
            return (Criteria) this;
        }

        public Criteria andOIntfield1GreaterThanOrEqualTo(String value) {
            addCriterion("o_intField1 >=", value, "oIntfield1");
            return (Criteria) this;
        }

        public Criteria andOIntfield1LessThan(String value) {
            addCriterion("o_intField1 <", value, "oIntfield1");
            return (Criteria) this;
        }

        public Criteria andOIntfield1LessThanOrEqualTo(String value) {
            addCriterion("o_intField1 <=", value, "oIntfield1");
            return (Criteria) this;
        }

        public Criteria andOIntfield1Like(String value) {
            addCriterion("o_intField1 like", value, "oIntfield1");
            return (Criteria) this;
        }

        public Criteria andOIntfield1NotLike(String value) {
            addCriterion("o_intField1 not like", value, "oIntfield1");
            return (Criteria) this;
        }

        public Criteria andOIntfield1In(List<String> values) {
            addCriterion("o_intField1 in", values, "oIntfield1");
            return (Criteria) this;
        }

        public Criteria andOIntfield1NotIn(List<String> values) {
            addCriterion("o_intField1 not in", values, "oIntfield1");
            return (Criteria) this;
        }

        public Criteria andOIntfield1Between(String value1, String value2) {
            addCriterion("o_intField1 between", value1, value2, "oIntfield1");
            return (Criteria) this;
        }

        public Criteria andOIntfield1NotBetween(String value1, String value2) {
            addCriterion("o_intField1 not between", value1, value2, "oIntfield1");
            return (Criteria) this;
        }

        public Criteria andOIntfield2IsNull() {
            addCriterion("o_intField2 is null");
            return (Criteria) this;
        }

        public Criteria andOIntfield2IsNotNull() {
            addCriterion("o_intField2 is not null");
            return (Criteria) this;
        }

        public Criteria andOIntfield2EqualTo(String value) {
            addCriterion("o_intField2 =", value, "oIntfield2");
            return (Criteria) this;
        }

        public Criteria andOIntfield2NotEqualTo(String value) {
            addCriterion("o_intField2 <>", value, "oIntfield2");
            return (Criteria) this;
        }

        public Criteria andOIntfield2GreaterThan(String value) {
            addCriterion("o_intField2 >", value, "oIntfield2");
            return (Criteria) this;
        }

        public Criteria andOIntfield2GreaterThanOrEqualTo(String value) {
            addCriterion("o_intField2 >=", value, "oIntfield2");
            return (Criteria) this;
        }

        public Criteria andOIntfield2LessThan(String value) {
            addCriterion("o_intField2 <", value, "oIntfield2");
            return (Criteria) this;
        }

        public Criteria andOIntfield2LessThanOrEqualTo(String value) {
            addCriterion("o_intField2 <=", value, "oIntfield2");
            return (Criteria) this;
        }

        public Criteria andOIntfield2Like(String value) {
            addCriterion("o_intField2 like", value, "oIntfield2");
            return (Criteria) this;
        }

        public Criteria andOIntfield2NotLike(String value) {
            addCriterion("o_intField2 not like", value, "oIntfield2");
            return (Criteria) this;
        }

        public Criteria andOIntfield2In(List<String> values) {
            addCriterion("o_intField2 in", values, "oIntfield2");
            return (Criteria) this;
        }

        public Criteria andOIntfield2NotIn(List<String> values) {
            addCriterion("o_intField2 not in", values, "oIntfield2");
            return (Criteria) this;
        }

        public Criteria andOIntfield2Between(String value1, String value2) {
            addCriterion("o_intField2 between", value1, value2, "oIntfield2");
            return (Criteria) this;
        }

        public Criteria andOIntfield2NotBetween(String value1, String value2) {
            addCriterion("o_intField2 not between", value1, value2, "oIntfield2");
            return (Criteria) this;
        }

        public Criteria andOStringfield1IsNull() {
            addCriterion("o_stringField1 is null");
            return (Criteria) this;
        }

        public Criteria andOStringfield1IsNotNull() {
            addCriterion("o_stringField1 is not null");
            return (Criteria) this;
        }

        public Criteria andOStringfield1EqualTo(String value) {
            addCriterion("o_stringField1 =", value, "oStringfield1");
            return (Criteria) this;
        }

        public Criteria andOStringfield1NotEqualTo(String value) {
            addCriterion("o_stringField1 <>", value, "oStringfield1");
            return (Criteria) this;
        }

        public Criteria andOStringfield1GreaterThan(String value) {
            addCriterion("o_stringField1 >", value, "oStringfield1");
            return (Criteria) this;
        }

        public Criteria andOStringfield1GreaterThanOrEqualTo(String value) {
            addCriterion("o_stringField1 >=", value, "oStringfield1");
            return (Criteria) this;
        }

        public Criteria andOStringfield1LessThan(String value) {
            addCriterion("o_stringField1 <", value, "oStringfield1");
            return (Criteria) this;
        }

        public Criteria andOStringfield1LessThanOrEqualTo(String value) {
            addCriterion("o_stringField1 <=", value, "oStringfield1");
            return (Criteria) this;
        }

        public Criteria andOStringfield1Like(String value) {
            addCriterion("o_stringField1 like", value, "oStringfield1");
            return (Criteria) this;
        }

        public Criteria andOStringfield1NotLike(String value) {
            addCriterion("o_stringField1 not like", value, "oStringfield1");
            return (Criteria) this;
        }

        public Criteria andOStringfield1In(List<String> values) {
            addCriterion("o_stringField1 in", values, "oStringfield1");
            return (Criteria) this;
        }

        public Criteria andOStringfield1NotIn(List<String> values) {
            addCriterion("o_stringField1 not in", values, "oStringfield1");
            return (Criteria) this;
        }

        public Criteria andOStringfield1Between(String value1, String value2) {
            addCriterion("o_stringField1 between", value1, value2, "oStringfield1");
            return (Criteria) this;
        }

        public Criteria andOStringfield1NotBetween(String value1, String value2) {
            addCriterion("o_stringField1 not between", value1, value2, "oStringfield1");
            return (Criteria) this;
        }

        public Criteria andOStringfield2IsNull() {
            addCriterion("o_stringField2 is null");
            return (Criteria) this;
        }

        public Criteria andOStringfield2IsNotNull() {
            addCriterion("o_stringField2 is not null");
            return (Criteria) this;
        }

        public Criteria andOStringfield2EqualTo(String value) {
            addCriterion("o_stringField2 =", value, "oStringfield2");
            return (Criteria) this;
        }

        public Criteria andOStringfield2NotEqualTo(String value) {
            addCriterion("o_stringField2 <>", value, "oStringfield2");
            return (Criteria) this;
        }

        public Criteria andOStringfield2GreaterThan(String value) {
            addCriterion("o_stringField2 >", value, "oStringfield2");
            return (Criteria) this;
        }

        public Criteria andOStringfield2GreaterThanOrEqualTo(String value) {
            addCriterion("o_stringField2 >=", value, "oStringfield2");
            return (Criteria) this;
        }

        public Criteria andOStringfield2LessThan(String value) {
            addCriterion("o_stringField2 <", value, "oStringfield2");
            return (Criteria) this;
        }

        public Criteria andOStringfield2LessThanOrEqualTo(String value) {
            addCriterion("o_stringField2 <=", value, "oStringfield2");
            return (Criteria) this;
        }

        public Criteria andOStringfield2Like(String value) {
            addCriterion("o_stringField2 like", value, "oStringfield2");
            return (Criteria) this;
        }

        public Criteria andOStringfield2NotLike(String value) {
            addCriterion("o_stringField2 not like", value, "oStringfield2");
            return (Criteria) this;
        }

        public Criteria andOStringfield2In(List<String> values) {
            addCriterion("o_stringField2 in", values, "oStringfield2");
            return (Criteria) this;
        }

        public Criteria andOStringfield2NotIn(List<String> values) {
            addCriterion("o_stringField2 not in", values, "oStringfield2");
            return (Criteria) this;
        }

        public Criteria andOStringfield2Between(String value1, String value2) {
            addCriterion("o_stringField2 between", value1, value2, "oStringfield2");
            return (Criteria) this;
        }

        public Criteria andOStringfield2NotBetween(String value1, String value2) {
            addCriterion("o_stringField2 not between", value1, value2, "oStringfield2");
            return (Criteria) this;
        }

        public Criteria andODatefield1IsNull() {
            addCriterion("o_dateField1 is null");
            return (Criteria) this;
        }

        public Criteria andODatefield1IsNotNull() {
            addCriterion("o_dateField1 is not null");
            return (Criteria) this;
        }

        public Criteria andODatefield1EqualTo(Date value) {
            addCriterionForJDBCDate("o_dateField1 =", value, "oDatefield1");
            return (Criteria) this;
        }

        public Criteria andODatefield1NotEqualTo(Date value) {
            addCriterionForJDBCDate("o_dateField1 <>", value, "oDatefield1");
            return (Criteria) this;
        }

        public Criteria andODatefield1GreaterThan(Date value) {
            addCriterionForJDBCDate("o_dateField1 >", value, "oDatefield1");
            return (Criteria) this;
        }

        public Criteria andODatefield1GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("o_dateField1 >=", value, "oDatefield1");
            return (Criteria) this;
        }

        public Criteria andODatefield1LessThan(Date value) {
            addCriterionForJDBCDate("o_dateField1 <", value, "oDatefield1");
            return (Criteria) this;
        }

        public Criteria andODatefield1LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("o_dateField1 <=", value, "oDatefield1");
            return (Criteria) this;
        }

        public Criteria andODatefield1In(List<Date> values) {
            addCriterionForJDBCDate("o_dateField1 in", values, "oDatefield1");
            return (Criteria) this;
        }

        public Criteria andODatefield1NotIn(List<Date> values) {
            addCriterionForJDBCDate("o_dateField1 not in", values, "oDatefield1");
            return (Criteria) this;
        }

        public Criteria andODatefield1Between(Date value1, Date value2) {
            addCriterionForJDBCDate("o_dateField1 between", value1, value2, "oDatefield1");
            return (Criteria) this;
        }

        public Criteria andODatefield1NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("o_dateField1 not between", value1, value2, "oDatefield1");
            return (Criteria) this;
        }

        public Criteria andODatefield2IsNull() {
            addCriterion("o_dateField2 is null");
            return (Criteria) this;
        }

        public Criteria andODatefield2IsNotNull() {
            addCriterion("o_dateField2 is not null");
            return (Criteria) this;
        }

        public Criteria andODatefield2EqualTo(Date value) {
            addCriterionForJDBCDate("o_dateField2 =", value, "oDatefield2");
            return (Criteria) this;
        }

        public Criteria andODatefield2NotEqualTo(Date value) {
            addCriterionForJDBCDate("o_dateField2 <>", value, "oDatefield2");
            return (Criteria) this;
        }

        public Criteria andODatefield2GreaterThan(Date value) {
            addCriterionForJDBCDate("o_dateField2 >", value, "oDatefield2");
            return (Criteria) this;
        }

        public Criteria andODatefield2GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("o_dateField2 >=", value, "oDatefield2");
            return (Criteria) this;
        }

        public Criteria andODatefield2LessThan(Date value) {
            addCriterionForJDBCDate("o_dateField2 <", value, "oDatefield2");
            return (Criteria) this;
        }

        public Criteria andODatefield2LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("o_dateField2 <=", value, "oDatefield2");
            return (Criteria) this;
        }

        public Criteria andODatefield2In(List<Date> values) {
            addCriterionForJDBCDate("o_dateField2 in", values, "oDatefield2");
            return (Criteria) this;
        }

        public Criteria andODatefield2NotIn(List<Date> values) {
            addCriterionForJDBCDate("o_dateField2 not in", values, "oDatefield2");
            return (Criteria) this;
        }

        public Criteria andODatefield2Between(Date value1, Date value2) {
            addCriterionForJDBCDate("o_dateField2 between", value1, value2, "oDatefield2");
            return (Criteria) this;
        }

        public Criteria andODatefield2NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("o_dateField2 not between", value1, value2, "oDatefield2");
            return (Criteria) this;
        }

        public Criteria andODatetimefield1IsNull() {
            addCriterion("o_datetimeField1 is null");
            return (Criteria) this;
        }

        public Criteria andODatetimefield1IsNotNull() {
            addCriterion("o_datetimeField1 is not null");
            return (Criteria) this;
        }

        public Criteria andODatetimefield1EqualTo(Date value) {
            addCriterion("o_datetimeField1 =", value, "oDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andODatetimefield1NotEqualTo(Date value) {
            addCriterion("o_datetimeField1 <>", value, "oDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andODatetimefield1GreaterThan(Date value) {
            addCriterion("o_datetimeField1 >", value, "oDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andODatetimefield1GreaterThanOrEqualTo(Date value) {
            addCriterion("o_datetimeField1 >=", value, "oDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andODatetimefield1LessThan(Date value) {
            addCriterion("o_datetimeField1 <", value, "oDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andODatetimefield1LessThanOrEqualTo(Date value) {
            addCriterion("o_datetimeField1 <=", value, "oDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andODatetimefield1In(List<Date> values) {
            addCriterion("o_datetimeField1 in", values, "oDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andODatetimefield1NotIn(List<Date> values) {
            addCriterion("o_datetimeField1 not in", values, "oDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andODatetimefield1Between(Date value1, Date value2) {
            addCriterion("o_datetimeField1 between", value1, value2, "oDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andODatetimefield1NotBetween(Date value1, Date value2) {
            addCriterion("o_datetimeField1 not between", value1, value2, "oDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andODatetimefield2IsNull() {
            addCriterion("o_datetimeField2 is null");
            return (Criteria) this;
        }

        public Criteria andODatetimefield2IsNotNull() {
            addCriterion("o_datetimeField2 is not null");
            return (Criteria) this;
        }

        public Criteria andODatetimefield2EqualTo(Date value) {
            addCriterion("o_datetimeField2 =", value, "oDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andODatetimefield2NotEqualTo(Date value) {
            addCriterion("o_datetimeField2 <>", value, "oDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andODatetimefield2GreaterThan(Date value) {
            addCriterion("o_datetimeField2 >", value, "oDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andODatetimefield2GreaterThanOrEqualTo(Date value) {
            addCriterion("o_datetimeField2 >=", value, "oDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andODatetimefield2LessThan(Date value) {
            addCriterion("o_datetimeField2 <", value, "oDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andODatetimefield2LessThanOrEqualTo(Date value) {
            addCriterion("o_datetimeField2 <=", value, "oDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andODatetimefield2In(List<Date> values) {
            addCriterion("o_datetimeField2 in", values, "oDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andODatetimefield2NotIn(List<Date> values) {
            addCriterion("o_datetimeField2 not in", values, "oDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andODatetimefield2Between(Date value1, Date value2) {
            addCriterion("o_datetimeField2 between", value1, value2, "oDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andODatetimefield2NotBetween(Date value1, Date value2) {
            addCriterion("o_datetimeField2 not between", value1, value2, "oDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andOBoolfield1IsNull() {
            addCriterion("o_boolField1 is null");
            return (Criteria) this;
        }

        public Criteria andOBoolfield1IsNotNull() {
            addCriterion("o_boolField1 is not null");
            return (Criteria) this;
        }

        public Criteria andOBoolfield1EqualTo(Boolean value) {
            addCriterion("o_boolField1 =", value, "oBoolfield1");
            return (Criteria) this;
        }

        public Criteria andOBoolfield1NotEqualTo(Boolean value) {
            addCriterion("o_boolField1 <>", value, "oBoolfield1");
            return (Criteria) this;
        }

        public Criteria andOBoolfield1GreaterThan(Boolean value) {
            addCriterion("o_boolField1 >", value, "oBoolfield1");
            return (Criteria) this;
        }

        public Criteria andOBoolfield1GreaterThanOrEqualTo(Boolean value) {
            addCriterion("o_boolField1 >=", value, "oBoolfield1");
            return (Criteria) this;
        }

        public Criteria andOBoolfield1LessThan(Boolean value) {
            addCriterion("o_boolField1 <", value, "oBoolfield1");
            return (Criteria) this;
        }

        public Criteria andOBoolfield1LessThanOrEqualTo(Boolean value) {
            addCriterion("o_boolField1 <=", value, "oBoolfield1");
            return (Criteria) this;
        }

        public Criteria andOBoolfield1In(List<Boolean> values) {
            addCriterion("o_boolField1 in", values, "oBoolfield1");
            return (Criteria) this;
        }

        public Criteria andOBoolfield1NotIn(List<Boolean> values) {
            addCriterion("o_boolField1 not in", values, "oBoolfield1");
            return (Criteria) this;
        }

        public Criteria andOBoolfield1Between(Boolean value1, Boolean value2) {
            addCriterion("o_boolField1 between", value1, value2, "oBoolfield1");
            return (Criteria) this;
        }

        public Criteria andOBoolfield1NotBetween(Boolean value1, Boolean value2) {
            addCriterion("o_boolField1 not between", value1, value2, "oBoolfield1");
            return (Criteria) this;
        }

        public Criteria andOBoolfield2IsNull() {
            addCriterion("o_boolField2 is null");
            return (Criteria) this;
        }

        public Criteria andOBoolfield2IsNotNull() {
            addCriterion("o_boolField2 is not null");
            return (Criteria) this;
        }

        public Criteria andOBoolfield2EqualTo(Boolean value) {
            addCriterion("o_boolField2 =", value, "oBoolfield2");
            return (Criteria) this;
        }

        public Criteria andOBoolfield2NotEqualTo(Boolean value) {
            addCriterion("o_boolField2 <>", value, "oBoolfield2");
            return (Criteria) this;
        }

        public Criteria andOBoolfield2GreaterThan(Boolean value) {
            addCriterion("o_boolField2 >", value, "oBoolfield2");
            return (Criteria) this;
        }

        public Criteria andOBoolfield2GreaterThanOrEqualTo(Boolean value) {
            addCriterion("o_boolField2 >=", value, "oBoolfield2");
            return (Criteria) this;
        }

        public Criteria andOBoolfield2LessThan(Boolean value) {
            addCriterion("o_boolField2 <", value, "oBoolfield2");
            return (Criteria) this;
        }

        public Criteria andOBoolfield2LessThanOrEqualTo(Boolean value) {
            addCriterion("o_boolField2 <=", value, "oBoolfield2");
            return (Criteria) this;
        }

        public Criteria andOBoolfield2In(List<Boolean> values) {
            addCriterion("o_boolField2 in", values, "oBoolfield2");
            return (Criteria) this;
        }

        public Criteria andOBoolfield2NotIn(List<Boolean> values) {
            addCriterion("o_boolField2 not in", values, "oBoolfield2");
            return (Criteria) this;
        }

        public Criteria andOBoolfield2Between(Boolean value1, Boolean value2) {
            addCriterion("o_boolField2 between", value1, value2, "oBoolfield2");
            return (Criteria) this;
        }

        public Criteria andOBoolfield2NotBetween(Boolean value1, Boolean value2) {
            addCriterion("o_boolField2 not between", value1, value2, "oBoolfield2");
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