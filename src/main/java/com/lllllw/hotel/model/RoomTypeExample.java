package com.lllllw.hotel.model;

import java.util.ArrayList;
import java.util.List;

public class RoomTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomTypeExample() {
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

        public Criteria andTIdIsNull() {
            addCriterion("t_id is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("t_id is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(Integer value) {
            addCriterion("t_id =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(Integer value) {
            addCriterion("t_id <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(Integer value) {
            addCriterion("t_id >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_id >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(Integer value) {
            addCriterion("t_id <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_id <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<Integer> values) {
            addCriterion("t_id in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<Integer> values) {
            addCriterion("t_id not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(Integer value1, Integer value2) {
            addCriterion("t_id between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_id not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTNameIsNull() {
            addCriterion("t_name is null");
            return (Criteria) this;
        }

        public Criteria andTNameIsNotNull() {
            addCriterion("t_name is not null");
            return (Criteria) this;
        }

        public Criteria andTNameEqualTo(String value) {
            addCriterion("t_name =", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotEqualTo(String value) {
            addCriterion("t_name <>", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThan(String value) {
            addCriterion("t_name >", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThanOrEqualTo(String value) {
            addCriterion("t_name >=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThan(String value) {
            addCriterion("t_name <", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThanOrEqualTo(String value) {
            addCriterion("t_name <=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLike(String value) {
            addCriterion("t_name like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotLike(String value) {
            addCriterion("t_name not like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameIn(List<String> values) {
            addCriterion("t_name in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotIn(List<String> values) {
            addCriterion("t_name not in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameBetween(String value1, String value2) {
            addCriterion("t_name between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotBetween(String value1, String value2) {
            addCriterion("t_name not between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTBedIsNull() {
            addCriterion("t_bed is null");
            return (Criteria) this;
        }

        public Criteria andTBedIsNotNull() {
            addCriterion("t_bed is not null");
            return (Criteria) this;
        }

        public Criteria andTBedEqualTo(String value) {
            addCriterion("t_bed =", value, "tBed");
            return (Criteria) this;
        }

        public Criteria andTBedNotEqualTo(String value) {
            addCriterion("t_bed <>", value, "tBed");
            return (Criteria) this;
        }

        public Criteria andTBedGreaterThan(String value) {
            addCriterion("t_bed >", value, "tBed");
            return (Criteria) this;
        }

        public Criteria andTBedGreaterThanOrEqualTo(String value) {
            addCriterion("t_bed >=", value, "tBed");
            return (Criteria) this;
        }

        public Criteria andTBedLessThan(String value) {
            addCriterion("t_bed <", value, "tBed");
            return (Criteria) this;
        }

        public Criteria andTBedLessThanOrEqualTo(String value) {
            addCriterion("t_bed <=", value, "tBed");
            return (Criteria) this;
        }

        public Criteria andTBedLike(String value) {
            addCriterion("t_bed like", value, "tBed");
            return (Criteria) this;
        }

        public Criteria andTBedNotLike(String value) {
            addCriterion("t_bed not like", value, "tBed");
            return (Criteria) this;
        }

        public Criteria andTBedIn(List<String> values) {
            addCriterion("t_bed in", values, "tBed");
            return (Criteria) this;
        }

        public Criteria andTBedNotIn(List<String> values) {
            addCriterion("t_bed not in", values, "tBed");
            return (Criteria) this;
        }

        public Criteria andTBedBetween(String value1, String value2) {
            addCriterion("t_bed between", value1, value2, "tBed");
            return (Criteria) this;
        }

        public Criteria andTBedNotBetween(String value1, String value2) {
            addCriterion("t_bed not between", value1, value2, "tBed");
            return (Criteria) this;
        }

        public Criteria andTMemberIsNull() {
            addCriterion("t_member is null");
            return (Criteria) this;
        }

        public Criteria andTMemberIsNotNull() {
            addCriterion("t_member is not null");
            return (Criteria) this;
        }

        public Criteria andTMemberEqualTo(Integer value) {
            addCriterion("t_member =", value, "tMember");
            return (Criteria) this;
        }

        public Criteria andTMemberNotEqualTo(Integer value) {
            addCriterion("t_member <>", value, "tMember");
            return (Criteria) this;
        }

        public Criteria andTMemberGreaterThan(Integer value) {
            addCriterion("t_member >", value, "tMember");
            return (Criteria) this;
        }

        public Criteria andTMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_member >=", value, "tMember");
            return (Criteria) this;
        }

        public Criteria andTMemberLessThan(Integer value) {
            addCriterion("t_member <", value, "tMember");
            return (Criteria) this;
        }

        public Criteria andTMemberLessThanOrEqualTo(Integer value) {
            addCriterion("t_member <=", value, "tMember");
            return (Criteria) this;
        }

        public Criteria andTMemberIn(List<Integer> values) {
            addCriterion("t_member in", values, "tMember");
            return (Criteria) this;
        }

        public Criteria andTMemberNotIn(List<Integer> values) {
            addCriterion("t_member not in", values, "tMember");
            return (Criteria) this;
        }

        public Criteria andTMemberBetween(Integer value1, Integer value2) {
            addCriterion("t_member between", value1, value2, "tMember");
            return (Criteria) this;
        }

        public Criteria andTMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("t_member not between", value1, value2, "tMember");
            return (Criteria) this;
        }

        public Criteria andTPoIsNull() {
            addCriterion("t_po is null");
            return (Criteria) this;
        }

        public Criteria andTPoIsNotNull() {
            addCriterion("t_po is not null");
            return (Criteria) this;
        }

        public Criteria andTPoEqualTo(String value) {
            addCriterion("t_po =", value, "tPo");
            return (Criteria) this;
        }

        public Criteria andTPoNotEqualTo(String value) {
            addCriterion("t_po <>", value, "tPo");
            return (Criteria) this;
        }

        public Criteria andTPoGreaterThan(String value) {
            addCriterion("t_po >", value, "tPo");
            return (Criteria) this;
        }

        public Criteria andTPoGreaterThanOrEqualTo(String value) {
            addCriterion("t_po >=", value, "tPo");
            return (Criteria) this;
        }

        public Criteria andTPoLessThan(String value) {
            addCriterion("t_po <", value, "tPo");
            return (Criteria) this;
        }

        public Criteria andTPoLessThanOrEqualTo(String value) {
            addCriterion("t_po <=", value, "tPo");
            return (Criteria) this;
        }

        public Criteria andTPoLike(String value) {
            addCriterion("t_po like", value, "tPo");
            return (Criteria) this;
        }

        public Criteria andTPoNotLike(String value) {
            addCriterion("t_po not like", value, "tPo");
            return (Criteria) this;
        }

        public Criteria andTPoIn(List<String> values) {
            addCriterion("t_po in", values, "tPo");
            return (Criteria) this;
        }

        public Criteria andTPoNotIn(List<String> values) {
            addCriterion("t_po not in", values, "tPo");
            return (Criteria) this;
        }

        public Criteria andTPoBetween(String value1, String value2) {
            addCriterion("t_po between", value1, value2, "tPo");
            return (Criteria) this;
        }

        public Criteria andTPoNotBetween(String value1, String value2) {
            addCriterion("t_po not between", value1, value2, "tPo");
            return (Criteria) this;
        }

        public Criteria andTBathIsNull() {
            addCriterion("t_bath is null");
            return (Criteria) this;
        }

        public Criteria andTBathIsNotNull() {
            addCriterion("t_bath is not null");
            return (Criteria) this;
        }

        public Criteria andTBathEqualTo(String value) {
            addCriterion("t_bath =", value, "tBath");
            return (Criteria) this;
        }

        public Criteria andTBathNotEqualTo(String value) {
            addCriterion("t_bath <>", value, "tBath");
            return (Criteria) this;
        }

        public Criteria andTBathGreaterThan(String value) {
            addCriterion("t_bath >", value, "tBath");
            return (Criteria) this;
        }

        public Criteria andTBathGreaterThanOrEqualTo(String value) {
            addCriterion("t_bath >=", value, "tBath");
            return (Criteria) this;
        }

        public Criteria andTBathLessThan(String value) {
            addCriterion("t_bath <", value, "tBath");
            return (Criteria) this;
        }

        public Criteria andTBathLessThanOrEqualTo(String value) {
            addCriterion("t_bath <=", value, "tBath");
            return (Criteria) this;
        }

        public Criteria andTBathLike(String value) {
            addCriterion("t_bath like", value, "tBath");
            return (Criteria) this;
        }

        public Criteria andTBathNotLike(String value) {
            addCriterion("t_bath not like", value, "tBath");
            return (Criteria) this;
        }

        public Criteria andTBathIn(List<String> values) {
            addCriterion("t_bath in", values, "tBath");
            return (Criteria) this;
        }

        public Criteria andTBathNotIn(List<String> values) {
            addCriterion("t_bath not in", values, "tBath");
            return (Criteria) this;
        }

        public Criteria andTBathBetween(String value1, String value2) {
            addCriterion("t_bath between", value1, value2, "tBath");
            return (Criteria) this;
        }

        public Criteria andTBathNotBetween(String value1, String value2) {
            addCriterion("t_bath not between", value1, value2, "tBath");
            return (Criteria) this;
        }

        public Criteria andTRemarksIsNull() {
            addCriterion("t_remarks is null");
            return (Criteria) this;
        }

        public Criteria andTRemarksIsNotNull() {
            addCriterion("t_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andTRemarksEqualTo(String value) {
            addCriterion("t_remarks =", value, "tRemarks");
            return (Criteria) this;
        }

        public Criteria andTRemarksNotEqualTo(String value) {
            addCriterion("t_remarks <>", value, "tRemarks");
            return (Criteria) this;
        }

        public Criteria andTRemarksGreaterThan(String value) {
            addCriterion("t_remarks >", value, "tRemarks");
            return (Criteria) this;
        }

        public Criteria andTRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("t_remarks >=", value, "tRemarks");
            return (Criteria) this;
        }

        public Criteria andTRemarksLessThan(String value) {
            addCriterion("t_remarks <", value, "tRemarks");
            return (Criteria) this;
        }

        public Criteria andTRemarksLessThanOrEqualTo(String value) {
            addCriterion("t_remarks <=", value, "tRemarks");
            return (Criteria) this;
        }

        public Criteria andTRemarksLike(String value) {
            addCriterion("t_remarks like", value, "tRemarks");
            return (Criteria) this;
        }

        public Criteria andTRemarksNotLike(String value) {
            addCriterion("t_remarks not like", value, "tRemarks");
            return (Criteria) this;
        }

        public Criteria andTRemarksIn(List<String> values) {
            addCriterion("t_remarks in", values, "tRemarks");
            return (Criteria) this;
        }

        public Criteria andTRemarksNotIn(List<String> values) {
            addCriterion("t_remarks not in", values, "tRemarks");
            return (Criteria) this;
        }

        public Criteria andTRemarksBetween(String value1, String value2) {
            addCriterion("t_remarks between", value1, value2, "tRemarks");
            return (Criteria) this;
        }

        public Criteria andTRemarksNotBetween(String value1, String value2) {
            addCriterion("t_remarks not between", value1, value2, "tRemarks");
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