package com.lllllw.hotel.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomExample() {
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

        public Criteria andRIdIsNull() {
            addCriterion("r_id is null");
            return (Criteria) this;
        }

        public Criteria andRIdIsNotNull() {
            addCriterion("r_id is not null");
            return (Criteria) this;
        }

        public Criteria andRIdEqualTo(Integer value) {
            addCriterion("r_id =", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotEqualTo(Integer value) {
            addCriterion("r_id <>", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThan(Integer value) {
            addCriterion("r_id >", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_id >=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThan(Integer value) {
            addCriterion("r_id <", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThanOrEqualTo(Integer value) {
            addCriterion("r_id <=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdIn(List<Integer> values) {
            addCriterion("r_id in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotIn(List<Integer> values) {
            addCriterion("r_id not in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdBetween(Integer value1, Integer value2) {
            addCriterion("r_id between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotBetween(Integer value1, Integer value2) {
            addCriterion("r_id not between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRNumberIsNull() {
            addCriterion("r_number is null");
            return (Criteria) this;
        }

        public Criteria andRNumberIsNotNull() {
            addCriterion("r_number is not null");
            return (Criteria) this;
        }

        public Criteria andRNumberEqualTo(String value) {
            addCriterion("r_number =", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberNotEqualTo(String value) {
            addCriterion("r_number <>", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberGreaterThan(String value) {
            addCriterion("r_number >", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberGreaterThanOrEqualTo(String value) {
            addCriterion("r_number >=", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberLessThan(String value) {
            addCriterion("r_number <", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberLessThanOrEqualTo(String value) {
            addCriterion("r_number <=", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberLike(String value) {
            addCriterion("r_number like", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberNotLike(String value) {
            addCriterion("r_number not like", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberIn(List<String> values) {
            addCriterion("r_number in", values, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberNotIn(List<String> values) {
            addCriterion("r_number not in", values, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberBetween(String value1, String value2) {
            addCriterion("r_number between", value1, value2, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberNotBetween(String value1, String value2) {
            addCriterion("r_number not between", value1, value2, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRTypeIsNull() {
            addCriterion("r_type is null");
            return (Criteria) this;
        }

        public Criteria andRTypeIsNotNull() {
            addCriterion("r_type is not null");
            return (Criteria) this;
        }

        public Criteria andRTypeEqualTo(String value) {
            addCriterion("r_type =", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeNotEqualTo(String value) {
            addCriterion("r_type <>", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeGreaterThan(String value) {
            addCriterion("r_type >", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeGreaterThanOrEqualTo(String value) {
            addCriterion("r_type >=", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeLessThan(String value) {
            addCriterion("r_type <", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeLessThanOrEqualTo(String value) {
            addCriterion("r_type <=", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeLike(String value) {
            addCriterion("r_type like", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeNotLike(String value) {
            addCriterion("r_type not like", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeIn(List<String> values) {
            addCriterion("r_type in", values, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeNotIn(List<String> values) {
            addCriterion("r_type not in", values, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeBetween(String value1, String value2) {
            addCriterion("r_type between", value1, value2, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeNotBetween(String value1, String value2) {
            addCriterion("r_type not between", value1, value2, "rType");
            return (Criteria) this;
        }

        public Criteria andRMemberIsNull() {
            addCriterion("r_member is null");
            return (Criteria) this;
        }

        public Criteria andRMemberIsNotNull() {
            addCriterion("r_member is not null");
            return (Criteria) this;
        }

        public Criteria andRMemberEqualTo(Integer value) {
            addCriterion("r_member =", value, "rMember");
            return (Criteria) this;
        }

        public Criteria andRMemberNotEqualTo(Integer value) {
            addCriterion("r_member <>", value, "rMember");
            return (Criteria) this;
        }

        public Criteria andRMemberGreaterThan(Integer value) {
            addCriterion("r_member >", value, "rMember");
            return (Criteria) this;
        }

        public Criteria andRMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_member >=", value, "rMember");
            return (Criteria) this;
        }

        public Criteria andRMemberLessThan(Integer value) {
            addCriterion("r_member <", value, "rMember");
            return (Criteria) this;
        }

        public Criteria andRMemberLessThanOrEqualTo(Integer value) {
            addCriterion("r_member <=", value, "rMember");
            return (Criteria) this;
        }

        public Criteria andRMemberIn(List<Integer> values) {
            addCriterion("r_member in", values, "rMember");
            return (Criteria) this;
        }

        public Criteria andRMemberNotIn(List<Integer> values) {
            addCriterion("r_member not in", values, "rMember");
            return (Criteria) this;
        }

        public Criteria andRMemberBetween(Integer value1, Integer value2) {
            addCriterion("r_member between", value1, value2, "rMember");
            return (Criteria) this;
        }

        public Criteria andRMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("r_member not between", value1, value2, "rMember");
            return (Criteria) this;
        }

        public Criteria andROrderIsNull() {
            addCriterion("r_order is null");
            return (Criteria) this;
        }

        public Criteria andROrderIsNotNull() {
            addCriterion("r_order is not null");
            return (Criteria) this;
        }

        public Criteria andROrderEqualTo(Integer value) {
            addCriterion("r_order =", value, "rOrder");
            return (Criteria) this;
        }

        public Criteria andROrderNotEqualTo(Integer value) {
            addCriterion("r_order <>", value, "rOrder");
            return (Criteria) this;
        }

        public Criteria andROrderGreaterThan(Integer value) {
            addCriterion("r_order >", value, "rOrder");
            return (Criteria) this;
        }

        public Criteria andROrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_order >=", value, "rOrder");
            return (Criteria) this;
        }

        public Criteria andROrderLessThan(Integer value) {
            addCriterion("r_order <", value, "rOrder");
            return (Criteria) this;
        }

        public Criteria andROrderLessThanOrEqualTo(Integer value) {
            addCriterion("r_order <=", value, "rOrder");
            return (Criteria) this;
        }

        public Criteria andROrderIn(List<Integer> values) {
            addCriterion("r_order in", values, "rOrder");
            return (Criteria) this;
        }

        public Criteria andROrderNotIn(List<Integer> values) {
            addCriterion("r_order not in", values, "rOrder");
            return (Criteria) this;
        }

        public Criteria andROrderBetween(Integer value1, Integer value2) {
            addCriterion("r_order between", value1, value2, "rOrder");
            return (Criteria) this;
        }

        public Criteria andROrderNotBetween(Integer value1, Integer value2) {
            addCriterion("r_order not between", value1, value2, "rOrder");
            return (Criteria) this;
        }

        public Criteria andRPriceIsNull() {
            addCriterion("r_price is null");
            return (Criteria) this;
        }

        public Criteria andRPriceIsNotNull() {
            addCriterion("r_price is not null");
            return (Criteria) this;
        }

        public Criteria andRPriceEqualTo(Double value) {
            addCriterion("r_price =", value, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRPriceNotEqualTo(Double value) {
            addCriterion("r_price <>", value, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRPriceGreaterThan(Double value) {
            addCriterion("r_price >", value, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("r_price >=", value, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRPriceLessThan(Double value) {
            addCriterion("r_price <", value, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRPriceLessThanOrEqualTo(Double value) {
            addCriterion("r_price <=", value, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRPriceIn(List<Double> values) {
            addCriterion("r_price in", values, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRPriceNotIn(List<Double> values) {
            addCriterion("r_price not in", values, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRPriceBetween(Double value1, Double value2) {
            addCriterion("r_price between", value1, value2, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRPriceNotBetween(Double value1, Double value2) {
            addCriterion("r_price not between", value1, value2, "rPrice");
            return (Criteria) this;
        }

        public Criteria andRCreatedIsNull() {
            addCriterion("r_created is null");
            return (Criteria) this;
        }

        public Criteria andRCreatedIsNotNull() {
            addCriterion("r_created is not null");
            return (Criteria) this;
        }

        public Criteria andRCreatedEqualTo(Date value) {
            addCriterion("r_created =", value, "rCreated");
            return (Criteria) this;
        }

        public Criteria andRCreatedNotEqualTo(Date value) {
            addCriterion("r_created <>", value, "rCreated");
            return (Criteria) this;
        }

        public Criteria andRCreatedGreaterThan(Date value) {
            addCriterion("r_created >", value, "rCreated");
            return (Criteria) this;
        }

        public Criteria andRCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("r_created >=", value, "rCreated");
            return (Criteria) this;
        }

        public Criteria andRCreatedLessThan(Date value) {
            addCriterion("r_created <", value, "rCreated");
            return (Criteria) this;
        }

        public Criteria andRCreatedLessThanOrEqualTo(Date value) {
            addCriterion("r_created <=", value, "rCreated");
            return (Criteria) this;
        }

        public Criteria andRCreatedIn(List<Date> values) {
            addCriterion("r_created in", values, "rCreated");
            return (Criteria) this;
        }

        public Criteria andRCreatedNotIn(List<Date> values) {
            addCriterion("r_created not in", values, "rCreated");
            return (Criteria) this;
        }

        public Criteria andRCreatedBetween(Date value1, Date value2) {
            addCriterion("r_created between", value1, value2, "rCreated");
            return (Criteria) this;
        }

        public Criteria andRCreatedNotBetween(Date value1, Date value2) {
            addCriterion("r_created not between", value1, value2, "rCreated");
            return (Criteria) this;
        }

        public Criteria andRUpdatedIsNull() {
            addCriterion("r_updated is null");
            return (Criteria) this;
        }

        public Criteria andRUpdatedIsNotNull() {
            addCriterion("r_updated is not null");
            return (Criteria) this;
        }

        public Criteria andRUpdatedEqualTo(Date value) {
            addCriterion("r_updated =", value, "rUpdated");
            return (Criteria) this;
        }

        public Criteria andRUpdatedNotEqualTo(Date value) {
            addCriterion("r_updated <>", value, "rUpdated");
            return (Criteria) this;
        }

        public Criteria andRUpdatedGreaterThan(Date value) {
            addCriterion("r_updated >", value, "rUpdated");
            return (Criteria) this;
        }

        public Criteria andRUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("r_updated >=", value, "rUpdated");
            return (Criteria) this;
        }

        public Criteria andRUpdatedLessThan(Date value) {
            addCriterion("r_updated <", value, "rUpdated");
            return (Criteria) this;
        }

        public Criteria andRUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("r_updated <=", value, "rUpdated");
            return (Criteria) this;
        }

        public Criteria andRUpdatedIn(List<Date> values) {
            addCriterion("r_updated in", values, "rUpdated");
            return (Criteria) this;
        }

        public Criteria andRUpdatedNotIn(List<Date> values) {
            addCriterion("r_updated not in", values, "rUpdated");
            return (Criteria) this;
        }

        public Criteria andRUpdatedBetween(Date value1, Date value2) {
            addCriterion("r_updated between", value1, value2, "rUpdated");
            return (Criteria) this;
        }

        public Criteria andRUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("r_updated not between", value1, value2, "rUpdated");
            return (Criteria) this;
        }

        public Criteria andRIntfield1IsNull() {
            addCriterion("r_intField1 is null");
            return (Criteria) this;
        }

        public Criteria andRIntfield1IsNotNull() {
            addCriterion("r_intField1 is not null");
            return (Criteria) this;
        }

        public Criteria andRIntfield1EqualTo(Integer value) {
            addCriterion("r_intField1 =", value, "rIntfield1");
            return (Criteria) this;
        }

        public Criteria andRIntfield1NotEqualTo(Integer value) {
            addCriterion("r_intField1 <>", value, "rIntfield1");
            return (Criteria) this;
        }

        public Criteria andRIntfield1GreaterThan(Integer value) {
            addCriterion("r_intField1 >", value, "rIntfield1");
            return (Criteria) this;
        }

        public Criteria andRIntfield1GreaterThanOrEqualTo(Integer value) {
            addCriterion("r_intField1 >=", value, "rIntfield1");
            return (Criteria) this;
        }

        public Criteria andRIntfield1LessThan(Integer value) {
            addCriterion("r_intField1 <", value, "rIntfield1");
            return (Criteria) this;
        }

        public Criteria andRIntfield1LessThanOrEqualTo(Integer value) {
            addCriterion("r_intField1 <=", value, "rIntfield1");
            return (Criteria) this;
        }

        public Criteria andRIntfield1In(List<Integer> values) {
            addCriterion("r_intField1 in", values, "rIntfield1");
            return (Criteria) this;
        }

        public Criteria andRIntfield1NotIn(List<Integer> values) {
            addCriterion("r_intField1 not in", values, "rIntfield1");
            return (Criteria) this;
        }

        public Criteria andRIntfield1Between(Integer value1, Integer value2) {
            addCriterion("r_intField1 between", value1, value2, "rIntfield1");
            return (Criteria) this;
        }

        public Criteria andRIntfield1NotBetween(Integer value1, Integer value2) {
            addCriterion("r_intField1 not between", value1, value2, "rIntfield1");
            return (Criteria) this;
        }

        public Criteria andRIntfield2IsNull() {
            addCriterion("r_intField2 is null");
            return (Criteria) this;
        }

        public Criteria andRIntfield2IsNotNull() {
            addCriterion("r_intField2 is not null");
            return (Criteria) this;
        }

        public Criteria andRIntfield2EqualTo(Integer value) {
            addCriterion("r_intField2 =", value, "rIntfield2");
            return (Criteria) this;
        }

        public Criteria andRIntfield2NotEqualTo(Integer value) {
            addCriterion("r_intField2 <>", value, "rIntfield2");
            return (Criteria) this;
        }

        public Criteria andRIntfield2GreaterThan(Integer value) {
            addCriterion("r_intField2 >", value, "rIntfield2");
            return (Criteria) this;
        }

        public Criteria andRIntfield2GreaterThanOrEqualTo(Integer value) {
            addCriterion("r_intField2 >=", value, "rIntfield2");
            return (Criteria) this;
        }

        public Criteria andRIntfield2LessThan(Integer value) {
            addCriterion("r_intField2 <", value, "rIntfield2");
            return (Criteria) this;
        }

        public Criteria andRIntfield2LessThanOrEqualTo(Integer value) {
            addCriterion("r_intField2 <=", value, "rIntfield2");
            return (Criteria) this;
        }

        public Criteria andRIntfield2In(List<Integer> values) {
            addCriterion("r_intField2 in", values, "rIntfield2");
            return (Criteria) this;
        }

        public Criteria andRIntfield2NotIn(List<Integer> values) {
            addCriterion("r_intField2 not in", values, "rIntfield2");
            return (Criteria) this;
        }

        public Criteria andRIntfield2Between(Integer value1, Integer value2) {
            addCriterion("r_intField2 between", value1, value2, "rIntfield2");
            return (Criteria) this;
        }

        public Criteria andRIntfield2NotBetween(Integer value1, Integer value2) {
            addCriterion("r_intField2 not between", value1, value2, "rIntfield2");
            return (Criteria) this;
        }

        public Criteria andRStringfield1IsNull() {
            addCriterion("r_stringField1 is null");
            return (Criteria) this;
        }

        public Criteria andRStringfield1IsNotNull() {
            addCriterion("r_stringField1 is not null");
            return (Criteria) this;
        }

        public Criteria andRStringfield1EqualTo(String value) {
            addCriterion("r_stringField1 =", value, "rStringfield1");
            return (Criteria) this;
        }

        public Criteria andRStringfield1NotEqualTo(String value) {
            addCriterion("r_stringField1 <>", value, "rStringfield1");
            return (Criteria) this;
        }

        public Criteria andRStringfield1GreaterThan(String value) {
            addCriterion("r_stringField1 >", value, "rStringfield1");
            return (Criteria) this;
        }

        public Criteria andRStringfield1GreaterThanOrEqualTo(String value) {
            addCriterion("r_stringField1 >=", value, "rStringfield1");
            return (Criteria) this;
        }

        public Criteria andRStringfield1LessThan(String value) {
            addCriterion("r_stringField1 <", value, "rStringfield1");
            return (Criteria) this;
        }

        public Criteria andRStringfield1LessThanOrEqualTo(String value) {
            addCriterion("r_stringField1 <=", value, "rStringfield1");
            return (Criteria) this;
        }

        public Criteria andRStringfield1Like(String value) {
            addCriterion("r_stringField1 like", value, "rStringfield1");
            return (Criteria) this;
        }

        public Criteria andRStringfield1NotLike(String value) {
            addCriterion("r_stringField1 not like", value, "rStringfield1");
            return (Criteria) this;
        }

        public Criteria andRStringfield1In(List<String> values) {
            addCriterion("r_stringField1 in", values, "rStringfield1");
            return (Criteria) this;
        }

        public Criteria andRStringfield1NotIn(List<String> values) {
            addCriterion("r_stringField1 not in", values, "rStringfield1");
            return (Criteria) this;
        }

        public Criteria andRStringfield1Between(String value1, String value2) {
            addCriterion("r_stringField1 between", value1, value2, "rStringfield1");
            return (Criteria) this;
        }

        public Criteria andRStringfield1NotBetween(String value1, String value2) {
            addCriterion("r_stringField1 not between", value1, value2, "rStringfield1");
            return (Criteria) this;
        }

        public Criteria andRStringfield2IsNull() {
            addCriterion("r_stringField2 is null");
            return (Criteria) this;
        }

        public Criteria andRStringfield2IsNotNull() {
            addCriterion("r_stringField2 is not null");
            return (Criteria) this;
        }

        public Criteria andRStringfield2EqualTo(String value) {
            addCriterion("r_stringField2 =", value, "rStringfield2");
            return (Criteria) this;
        }

        public Criteria andRStringfield2NotEqualTo(String value) {
            addCriterion("r_stringField2 <>", value, "rStringfield2");
            return (Criteria) this;
        }

        public Criteria andRStringfield2GreaterThan(String value) {
            addCriterion("r_stringField2 >", value, "rStringfield2");
            return (Criteria) this;
        }

        public Criteria andRStringfield2GreaterThanOrEqualTo(String value) {
            addCriterion("r_stringField2 >=", value, "rStringfield2");
            return (Criteria) this;
        }

        public Criteria andRStringfield2LessThan(String value) {
            addCriterion("r_stringField2 <", value, "rStringfield2");
            return (Criteria) this;
        }

        public Criteria andRStringfield2LessThanOrEqualTo(String value) {
            addCriterion("r_stringField2 <=", value, "rStringfield2");
            return (Criteria) this;
        }

        public Criteria andRStringfield2Like(String value) {
            addCriterion("r_stringField2 like", value, "rStringfield2");
            return (Criteria) this;
        }

        public Criteria andRStringfield2NotLike(String value) {
            addCriterion("r_stringField2 not like", value, "rStringfield2");
            return (Criteria) this;
        }

        public Criteria andRStringfield2In(List<String> values) {
            addCriterion("r_stringField2 in", values, "rStringfield2");
            return (Criteria) this;
        }

        public Criteria andRStringfield2NotIn(List<String> values) {
            addCriterion("r_stringField2 not in", values, "rStringfield2");
            return (Criteria) this;
        }

        public Criteria andRStringfield2Between(String value1, String value2) {
            addCriterion("r_stringField2 between", value1, value2, "rStringfield2");
            return (Criteria) this;
        }

        public Criteria andRStringfield2NotBetween(String value1, String value2) {
            addCriterion("r_stringField2 not between", value1, value2, "rStringfield2");
            return (Criteria) this;
        }

        public Criteria andRDatefield1IsNull() {
            addCriterion("r_dateField1 is null");
            return (Criteria) this;
        }

        public Criteria andRDatefield1IsNotNull() {
            addCriterion("r_dateField1 is not null");
            return (Criteria) this;
        }

        public Criteria andRDatefield1EqualTo(Date value) {
            addCriterionForJDBCDate("r_dateField1 =", value, "rDatefield1");
            return (Criteria) this;
        }

        public Criteria andRDatefield1NotEqualTo(Date value) {
            addCriterionForJDBCDate("r_dateField1 <>", value, "rDatefield1");
            return (Criteria) this;
        }

        public Criteria andRDatefield1GreaterThan(Date value) {
            addCriterionForJDBCDate("r_dateField1 >", value, "rDatefield1");
            return (Criteria) this;
        }

        public Criteria andRDatefield1GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("r_dateField1 >=", value, "rDatefield1");
            return (Criteria) this;
        }

        public Criteria andRDatefield1LessThan(Date value) {
            addCriterionForJDBCDate("r_dateField1 <", value, "rDatefield1");
            return (Criteria) this;
        }

        public Criteria andRDatefield1LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("r_dateField1 <=", value, "rDatefield1");
            return (Criteria) this;
        }

        public Criteria andRDatefield1In(List<Date> values) {
            addCriterionForJDBCDate("r_dateField1 in", values, "rDatefield1");
            return (Criteria) this;
        }

        public Criteria andRDatefield1NotIn(List<Date> values) {
            addCriterionForJDBCDate("r_dateField1 not in", values, "rDatefield1");
            return (Criteria) this;
        }

        public Criteria andRDatefield1Between(Date value1, Date value2) {
            addCriterionForJDBCDate("r_dateField1 between", value1, value2, "rDatefield1");
            return (Criteria) this;
        }

        public Criteria andRDatefield1NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("r_dateField1 not between", value1, value2, "rDatefield1");
            return (Criteria) this;
        }

        public Criteria andRDatefield2IsNull() {
            addCriterion("r_dateField2 is null");
            return (Criteria) this;
        }

        public Criteria andRDatefield2IsNotNull() {
            addCriterion("r_dateField2 is not null");
            return (Criteria) this;
        }

        public Criteria andRDatefield2EqualTo(Date value) {
            addCriterionForJDBCDate("r_dateField2 =", value, "rDatefield2");
            return (Criteria) this;
        }

        public Criteria andRDatefield2NotEqualTo(Date value) {
            addCriterionForJDBCDate("r_dateField2 <>", value, "rDatefield2");
            return (Criteria) this;
        }

        public Criteria andRDatefield2GreaterThan(Date value) {
            addCriterionForJDBCDate("r_dateField2 >", value, "rDatefield2");
            return (Criteria) this;
        }

        public Criteria andRDatefield2GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("r_dateField2 >=", value, "rDatefield2");
            return (Criteria) this;
        }

        public Criteria andRDatefield2LessThan(Date value) {
            addCriterionForJDBCDate("r_dateField2 <", value, "rDatefield2");
            return (Criteria) this;
        }

        public Criteria andRDatefield2LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("r_dateField2 <=", value, "rDatefield2");
            return (Criteria) this;
        }

        public Criteria andRDatefield2In(List<Date> values) {
            addCriterionForJDBCDate("r_dateField2 in", values, "rDatefield2");
            return (Criteria) this;
        }

        public Criteria andRDatefield2NotIn(List<Date> values) {
            addCriterionForJDBCDate("r_dateField2 not in", values, "rDatefield2");
            return (Criteria) this;
        }

        public Criteria andRDatefield2Between(Date value1, Date value2) {
            addCriterionForJDBCDate("r_dateField2 between", value1, value2, "rDatefield2");
            return (Criteria) this;
        }

        public Criteria andRDatefield2NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("r_dateField2 not between", value1, value2, "rDatefield2");
            return (Criteria) this;
        }

        public Criteria andRDatetimefield1IsNull() {
            addCriterion("r_dateTimeField1 is null");
            return (Criteria) this;
        }

        public Criteria andRDatetimefield1IsNotNull() {
            addCriterion("r_dateTimeField1 is not null");
            return (Criteria) this;
        }

        public Criteria andRDatetimefield1EqualTo(Date value) {
            addCriterion("r_dateTimeField1 =", value, "rDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andRDatetimefield1NotEqualTo(Date value) {
            addCriterion("r_dateTimeField1 <>", value, "rDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andRDatetimefield1GreaterThan(Date value) {
            addCriterion("r_dateTimeField1 >", value, "rDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andRDatetimefield1GreaterThanOrEqualTo(Date value) {
            addCriterion("r_dateTimeField1 >=", value, "rDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andRDatetimefield1LessThan(Date value) {
            addCriterion("r_dateTimeField1 <", value, "rDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andRDatetimefield1LessThanOrEqualTo(Date value) {
            addCriterion("r_dateTimeField1 <=", value, "rDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andRDatetimefield1In(List<Date> values) {
            addCriterion("r_dateTimeField1 in", values, "rDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andRDatetimefield1NotIn(List<Date> values) {
            addCriterion("r_dateTimeField1 not in", values, "rDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andRDatetimefield1Between(Date value1, Date value2) {
            addCriterion("r_dateTimeField1 between", value1, value2, "rDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andRDatetimefield1NotBetween(Date value1, Date value2) {
            addCriterion("r_dateTimeField1 not between", value1, value2, "rDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andRDatetimefield2IsNull() {
            addCriterion("r_dateTimeField2 is null");
            return (Criteria) this;
        }

        public Criteria andRDatetimefield2IsNotNull() {
            addCriterion("r_dateTimeField2 is not null");
            return (Criteria) this;
        }

        public Criteria andRDatetimefield2EqualTo(Date value) {
            addCriterion("r_dateTimeField2 =", value, "rDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andRDatetimefield2NotEqualTo(Date value) {
            addCriterion("r_dateTimeField2 <>", value, "rDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andRDatetimefield2GreaterThan(Date value) {
            addCriterion("r_dateTimeField2 >", value, "rDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andRDatetimefield2GreaterThanOrEqualTo(Date value) {
            addCriterion("r_dateTimeField2 >=", value, "rDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andRDatetimefield2LessThan(Date value) {
            addCriterion("r_dateTimeField2 <", value, "rDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andRDatetimefield2LessThanOrEqualTo(Date value) {
            addCriterion("r_dateTimeField2 <=", value, "rDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andRDatetimefield2In(List<Date> values) {
            addCriterion("r_dateTimeField2 in", values, "rDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andRDatetimefield2NotIn(List<Date> values) {
            addCriterion("r_dateTimeField2 not in", values, "rDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andRDatetimefield2Between(Date value1, Date value2) {
            addCriterion("r_dateTimeField2 between", value1, value2, "rDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andRDatetimefield2NotBetween(Date value1, Date value2) {
            addCriterion("r_dateTimeField2 not between", value1, value2, "rDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andRBoolfield1IsNull() {
            addCriterion("r_boolField1 is null");
            return (Criteria) this;
        }

        public Criteria andRBoolfield1IsNotNull() {
            addCriterion("r_boolField1 is not null");
            return (Criteria) this;
        }

        public Criteria andRBoolfield1EqualTo(Boolean value) {
            addCriterion("r_boolField1 =", value, "rBoolfield1");
            return (Criteria) this;
        }

        public Criteria andRBoolfield1NotEqualTo(Boolean value) {
            addCriterion("r_boolField1 <>", value, "rBoolfield1");
            return (Criteria) this;
        }

        public Criteria andRBoolfield1GreaterThan(Boolean value) {
            addCriterion("r_boolField1 >", value, "rBoolfield1");
            return (Criteria) this;
        }

        public Criteria andRBoolfield1GreaterThanOrEqualTo(Boolean value) {
            addCriterion("r_boolField1 >=", value, "rBoolfield1");
            return (Criteria) this;
        }

        public Criteria andRBoolfield1LessThan(Boolean value) {
            addCriterion("r_boolField1 <", value, "rBoolfield1");
            return (Criteria) this;
        }

        public Criteria andRBoolfield1LessThanOrEqualTo(Boolean value) {
            addCriterion("r_boolField1 <=", value, "rBoolfield1");
            return (Criteria) this;
        }

        public Criteria andRBoolfield1In(List<Boolean> values) {
            addCriterion("r_boolField1 in", values, "rBoolfield1");
            return (Criteria) this;
        }

        public Criteria andRBoolfield1NotIn(List<Boolean> values) {
            addCriterion("r_boolField1 not in", values, "rBoolfield1");
            return (Criteria) this;
        }

        public Criteria andRBoolfield1Between(Boolean value1, Boolean value2) {
            addCriterion("r_boolField1 between", value1, value2, "rBoolfield1");
            return (Criteria) this;
        }

        public Criteria andRBoolfield1NotBetween(Boolean value1, Boolean value2) {
            addCriterion("r_boolField1 not between", value1, value2, "rBoolfield1");
            return (Criteria) this;
        }

        public Criteria andRBoolfield2IsNull() {
            addCriterion("r_boolField2 is null");
            return (Criteria) this;
        }

        public Criteria andRBoolfield2IsNotNull() {
            addCriterion("r_boolField2 is not null");
            return (Criteria) this;
        }

        public Criteria andRBoolfield2EqualTo(Boolean value) {
            addCriterion("r_boolField2 =", value, "rBoolfield2");
            return (Criteria) this;
        }

        public Criteria andRBoolfield2NotEqualTo(Boolean value) {
            addCriterion("r_boolField2 <>", value, "rBoolfield2");
            return (Criteria) this;
        }

        public Criteria andRBoolfield2GreaterThan(Boolean value) {
            addCriterion("r_boolField2 >", value, "rBoolfield2");
            return (Criteria) this;
        }

        public Criteria andRBoolfield2GreaterThanOrEqualTo(Boolean value) {
            addCriterion("r_boolField2 >=", value, "rBoolfield2");
            return (Criteria) this;
        }

        public Criteria andRBoolfield2LessThan(Boolean value) {
            addCriterion("r_boolField2 <", value, "rBoolfield2");
            return (Criteria) this;
        }

        public Criteria andRBoolfield2LessThanOrEqualTo(Boolean value) {
            addCriterion("r_boolField2 <=", value, "rBoolfield2");
            return (Criteria) this;
        }

        public Criteria andRBoolfield2In(List<Boolean> values) {
            addCriterion("r_boolField2 in", values, "rBoolfield2");
            return (Criteria) this;
        }

        public Criteria andRBoolfield2NotIn(List<Boolean> values) {
            addCriterion("r_boolField2 not in", values, "rBoolfield2");
            return (Criteria) this;
        }

        public Criteria andRBoolfield2Between(Boolean value1, Boolean value2) {
            addCriterion("r_boolField2 between", value1, value2, "rBoolfield2");
            return (Criteria) this;
        }

        public Criteria andRBoolfield2NotBetween(Boolean value1, Boolean value2) {
            addCriterion("r_boolField2 not between", value1, value2, "rBoolfield2");
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