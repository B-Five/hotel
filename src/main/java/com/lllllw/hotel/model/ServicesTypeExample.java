package com.lllllw.hotel.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ServicesTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServicesTypeExample() {
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

        public Criteria andStIdIsNull() {
            addCriterion("st_id is null");
            return (Criteria) this;
        }

        public Criteria andStIdIsNotNull() {
            addCriterion("st_id is not null");
            return (Criteria) this;
        }

        public Criteria andStIdEqualTo(Integer value) {
            addCriterion("st_id =", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotEqualTo(Integer value) {
            addCriterion("st_id <>", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdGreaterThan(Integer value) {
            addCriterion("st_id >", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("st_id >=", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLessThan(Integer value) {
            addCriterion("st_id <", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLessThanOrEqualTo(Integer value) {
            addCriterion("st_id <=", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdIn(List<Integer> values) {
            addCriterion("st_id in", values, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotIn(List<Integer> values) {
            addCriterion("st_id not in", values, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdBetween(Integer value1, Integer value2) {
            addCriterion("st_id between", value1, value2, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotBetween(Integer value1, Integer value2) {
            addCriterion("st_id not between", value1, value2, "stId");
            return (Criteria) this;
        }

        public Criteria andStNameIsNull() {
            addCriterion("st_name is null");
            return (Criteria) this;
        }

        public Criteria andStNameIsNotNull() {
            addCriterion("st_name is not null");
            return (Criteria) this;
        }

        public Criteria andStNameEqualTo(String value) {
            addCriterion("st_name =", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotEqualTo(String value) {
            addCriterion("st_name <>", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameGreaterThan(String value) {
            addCriterion("st_name >", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameGreaterThanOrEqualTo(String value) {
            addCriterion("st_name >=", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLessThan(String value) {
            addCriterion("st_name <", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLessThanOrEqualTo(String value) {
            addCriterion("st_name <=", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLike(String value) {
            addCriterion("st_name like", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotLike(String value) {
            addCriterion("st_name not like", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameIn(List<String> values) {
            addCriterion("st_name in", values, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotIn(List<String> values) {
            addCriterion("st_name not in", values, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameBetween(String value1, String value2) {
            addCriterion("st_name between", value1, value2, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotBetween(String value1, String value2) {
            addCriterion("st_name not between", value1, value2, "stName");
            return (Criteria) this;
        }

        public Criteria andStDescIsNull() {
            addCriterion("st_desc is null");
            return (Criteria) this;
        }

        public Criteria andStDescIsNotNull() {
            addCriterion("st_desc is not null");
            return (Criteria) this;
        }

        public Criteria andStDescEqualTo(String value) {
            addCriterion("st_desc =", value, "stDesc");
            return (Criteria) this;
        }

        public Criteria andStDescNotEqualTo(String value) {
            addCriterion("st_desc <>", value, "stDesc");
            return (Criteria) this;
        }

        public Criteria andStDescGreaterThan(String value) {
            addCriterion("st_desc >", value, "stDesc");
            return (Criteria) this;
        }

        public Criteria andStDescGreaterThanOrEqualTo(String value) {
            addCriterion("st_desc >=", value, "stDesc");
            return (Criteria) this;
        }

        public Criteria andStDescLessThan(String value) {
            addCriterion("st_desc <", value, "stDesc");
            return (Criteria) this;
        }

        public Criteria andStDescLessThanOrEqualTo(String value) {
            addCriterion("st_desc <=", value, "stDesc");
            return (Criteria) this;
        }

        public Criteria andStDescLike(String value) {
            addCriterion("st_desc like", value, "stDesc");
            return (Criteria) this;
        }

        public Criteria andStDescNotLike(String value) {
            addCriterion("st_desc not like", value, "stDesc");
            return (Criteria) this;
        }

        public Criteria andStDescIn(List<String> values) {
            addCriterion("st_desc in", values, "stDesc");
            return (Criteria) this;
        }

        public Criteria andStDescNotIn(List<String> values) {
            addCriterion("st_desc not in", values, "stDesc");
            return (Criteria) this;
        }

        public Criteria andStDescBetween(String value1, String value2) {
            addCriterion("st_desc between", value1, value2, "stDesc");
            return (Criteria) this;
        }

        public Criteria andStDescNotBetween(String value1, String value2) {
            addCriterion("st_desc not between", value1, value2, "stDesc");
            return (Criteria) this;
        }

        public Criteria andStPriceIsNull() {
            addCriterion("st_price is null");
            return (Criteria) this;
        }

        public Criteria andStPriceIsNotNull() {
            addCriterion("st_price is not null");
            return (Criteria) this;
        }

        public Criteria andStPriceEqualTo(Double value) {
            addCriterion("st_price =", value, "stPrice");
            return (Criteria) this;
        }

        public Criteria andStPriceNotEqualTo(Double value) {
            addCriterion("st_price <>", value, "stPrice");
            return (Criteria) this;
        }

        public Criteria andStPriceGreaterThan(Double value) {
            addCriterion("st_price >", value, "stPrice");
            return (Criteria) this;
        }

        public Criteria andStPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("st_price >=", value, "stPrice");
            return (Criteria) this;
        }

        public Criteria andStPriceLessThan(Double value) {
            addCriterion("st_price <", value, "stPrice");
            return (Criteria) this;
        }

        public Criteria andStPriceLessThanOrEqualTo(Double value) {
            addCriterion("st_price <=", value, "stPrice");
            return (Criteria) this;
        }

        public Criteria andStPriceIn(List<Double> values) {
            addCriterion("st_price in", values, "stPrice");
            return (Criteria) this;
        }

        public Criteria andStPriceNotIn(List<Double> values) {
            addCriterion("st_price not in", values, "stPrice");
            return (Criteria) this;
        }

        public Criteria andStPriceBetween(Double value1, Double value2) {
            addCriterion("st_price between", value1, value2, "stPrice");
            return (Criteria) this;
        }

        public Criteria andStPriceNotBetween(Double value1, Double value2) {
            addCriterion("st_price not between", value1, value2, "stPrice");
            return (Criteria) this;
        }

        public Criteria andStCreatedIsNull() {
            addCriterion("st_created is null");
            return (Criteria) this;
        }

        public Criteria andStCreatedIsNotNull() {
            addCriterion("st_created is not null");
            return (Criteria) this;
        }

        public Criteria andStCreatedEqualTo(Date value) {
            addCriterion("st_created =", value, "stCreated");
            return (Criteria) this;
        }

        public Criteria andStCreatedNotEqualTo(Date value) {
            addCriterion("st_created <>", value, "stCreated");
            return (Criteria) this;
        }

        public Criteria andStCreatedGreaterThan(Date value) {
            addCriterion("st_created >", value, "stCreated");
            return (Criteria) this;
        }

        public Criteria andStCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("st_created >=", value, "stCreated");
            return (Criteria) this;
        }

        public Criteria andStCreatedLessThan(Date value) {
            addCriterion("st_created <", value, "stCreated");
            return (Criteria) this;
        }

        public Criteria andStCreatedLessThanOrEqualTo(Date value) {
            addCriterion("st_created <=", value, "stCreated");
            return (Criteria) this;
        }

        public Criteria andStCreatedIn(List<Date> values) {
            addCriterion("st_created in", values, "stCreated");
            return (Criteria) this;
        }

        public Criteria andStCreatedNotIn(List<Date> values) {
            addCriterion("st_created not in", values, "stCreated");
            return (Criteria) this;
        }

        public Criteria andStCreatedBetween(Date value1, Date value2) {
            addCriterion("st_created between", value1, value2, "stCreated");
            return (Criteria) this;
        }

        public Criteria andStCreatedNotBetween(Date value1, Date value2) {
            addCriterion("st_created not between", value1, value2, "stCreated");
            return (Criteria) this;
        }

        public Criteria andStUpdatedIsNull() {
            addCriterion("st_updated is null");
            return (Criteria) this;
        }

        public Criteria andStUpdatedIsNotNull() {
            addCriterion("st_updated is not null");
            return (Criteria) this;
        }

        public Criteria andStUpdatedEqualTo(Date value) {
            addCriterion("st_updated =", value, "stUpdated");
            return (Criteria) this;
        }

        public Criteria andStUpdatedNotEqualTo(Date value) {
            addCriterion("st_updated <>", value, "stUpdated");
            return (Criteria) this;
        }

        public Criteria andStUpdatedGreaterThan(Date value) {
            addCriterion("st_updated >", value, "stUpdated");
            return (Criteria) this;
        }

        public Criteria andStUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("st_updated >=", value, "stUpdated");
            return (Criteria) this;
        }

        public Criteria andStUpdatedLessThan(Date value) {
            addCriterion("st_updated <", value, "stUpdated");
            return (Criteria) this;
        }

        public Criteria andStUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("st_updated <=", value, "stUpdated");
            return (Criteria) this;
        }

        public Criteria andStUpdatedIn(List<Date> values) {
            addCriterion("st_updated in", values, "stUpdated");
            return (Criteria) this;
        }

        public Criteria andStUpdatedNotIn(List<Date> values) {
            addCriterion("st_updated not in", values, "stUpdated");
            return (Criteria) this;
        }

        public Criteria andStUpdatedBetween(Date value1, Date value2) {
            addCriterion("st_updated between", value1, value2, "stUpdated");
            return (Criteria) this;
        }

        public Criteria andStUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("st_updated not between", value1, value2, "stUpdated");
            return (Criteria) this;
        }

        public Criteria andStIntfield1IsNull() {
            addCriterion("st_intField1 is null");
            return (Criteria) this;
        }

        public Criteria andStIntfield1IsNotNull() {
            addCriterion("st_intField1 is not null");
            return (Criteria) this;
        }

        public Criteria andStIntfield1EqualTo(Integer value) {
            addCriterion("st_intField1 =", value, "stIntfield1");
            return (Criteria) this;
        }

        public Criteria andStIntfield1NotEqualTo(Integer value) {
            addCriterion("st_intField1 <>", value, "stIntfield1");
            return (Criteria) this;
        }

        public Criteria andStIntfield1GreaterThan(Integer value) {
            addCriterion("st_intField1 >", value, "stIntfield1");
            return (Criteria) this;
        }

        public Criteria andStIntfield1GreaterThanOrEqualTo(Integer value) {
            addCriterion("st_intField1 >=", value, "stIntfield1");
            return (Criteria) this;
        }

        public Criteria andStIntfield1LessThan(Integer value) {
            addCriterion("st_intField1 <", value, "stIntfield1");
            return (Criteria) this;
        }

        public Criteria andStIntfield1LessThanOrEqualTo(Integer value) {
            addCriterion("st_intField1 <=", value, "stIntfield1");
            return (Criteria) this;
        }

        public Criteria andStIntfield1In(List<Integer> values) {
            addCriterion("st_intField1 in", values, "stIntfield1");
            return (Criteria) this;
        }

        public Criteria andStIntfield1NotIn(List<Integer> values) {
            addCriterion("st_intField1 not in", values, "stIntfield1");
            return (Criteria) this;
        }

        public Criteria andStIntfield1Between(Integer value1, Integer value2) {
            addCriterion("st_intField1 between", value1, value2, "stIntfield1");
            return (Criteria) this;
        }

        public Criteria andStIntfield1NotBetween(Integer value1, Integer value2) {
            addCriterion("st_intField1 not between", value1, value2, "stIntfield1");
            return (Criteria) this;
        }

        public Criteria andStIntfield2IsNull() {
            addCriterion("st_intField2 is null");
            return (Criteria) this;
        }

        public Criteria andStIntfield2IsNotNull() {
            addCriterion("st_intField2 is not null");
            return (Criteria) this;
        }

        public Criteria andStIntfield2EqualTo(Integer value) {
            addCriterion("st_intField2 =", value, "stIntfield2");
            return (Criteria) this;
        }

        public Criteria andStIntfield2NotEqualTo(Integer value) {
            addCriterion("st_intField2 <>", value, "stIntfield2");
            return (Criteria) this;
        }

        public Criteria andStIntfield2GreaterThan(Integer value) {
            addCriterion("st_intField2 >", value, "stIntfield2");
            return (Criteria) this;
        }

        public Criteria andStIntfield2GreaterThanOrEqualTo(Integer value) {
            addCriterion("st_intField2 >=", value, "stIntfield2");
            return (Criteria) this;
        }

        public Criteria andStIntfield2LessThan(Integer value) {
            addCriterion("st_intField2 <", value, "stIntfield2");
            return (Criteria) this;
        }

        public Criteria andStIntfield2LessThanOrEqualTo(Integer value) {
            addCriterion("st_intField2 <=", value, "stIntfield2");
            return (Criteria) this;
        }

        public Criteria andStIntfield2In(List<Integer> values) {
            addCriterion("st_intField2 in", values, "stIntfield2");
            return (Criteria) this;
        }

        public Criteria andStIntfield2NotIn(List<Integer> values) {
            addCriterion("st_intField2 not in", values, "stIntfield2");
            return (Criteria) this;
        }

        public Criteria andStIntfield2Between(Integer value1, Integer value2) {
            addCriterion("st_intField2 between", value1, value2, "stIntfield2");
            return (Criteria) this;
        }

        public Criteria andStIntfield2NotBetween(Integer value1, Integer value2) {
            addCriterion("st_intField2 not between", value1, value2, "stIntfield2");
            return (Criteria) this;
        }

        public Criteria andStStringfield1IsNull() {
            addCriterion("st_stringField1 is null");
            return (Criteria) this;
        }

        public Criteria andStStringfield1IsNotNull() {
            addCriterion("st_stringField1 is not null");
            return (Criteria) this;
        }

        public Criteria andStStringfield1EqualTo(String value) {
            addCriterion("st_stringField1 =", value, "stStringfield1");
            return (Criteria) this;
        }

        public Criteria andStStringfield1NotEqualTo(String value) {
            addCriterion("st_stringField1 <>", value, "stStringfield1");
            return (Criteria) this;
        }

        public Criteria andStStringfield1GreaterThan(String value) {
            addCriterion("st_stringField1 >", value, "stStringfield1");
            return (Criteria) this;
        }

        public Criteria andStStringfield1GreaterThanOrEqualTo(String value) {
            addCriterion("st_stringField1 >=", value, "stStringfield1");
            return (Criteria) this;
        }

        public Criteria andStStringfield1LessThan(String value) {
            addCriterion("st_stringField1 <", value, "stStringfield1");
            return (Criteria) this;
        }

        public Criteria andStStringfield1LessThanOrEqualTo(String value) {
            addCriterion("st_stringField1 <=", value, "stStringfield1");
            return (Criteria) this;
        }

        public Criteria andStStringfield1Like(String value) {
            addCriterion("st_stringField1 like", value, "stStringfield1");
            return (Criteria) this;
        }

        public Criteria andStStringfield1NotLike(String value) {
            addCriterion("st_stringField1 not like", value, "stStringfield1");
            return (Criteria) this;
        }

        public Criteria andStStringfield1In(List<String> values) {
            addCriterion("st_stringField1 in", values, "stStringfield1");
            return (Criteria) this;
        }

        public Criteria andStStringfield1NotIn(List<String> values) {
            addCriterion("st_stringField1 not in", values, "stStringfield1");
            return (Criteria) this;
        }

        public Criteria andStStringfield1Between(String value1, String value2) {
            addCriterion("st_stringField1 between", value1, value2, "stStringfield1");
            return (Criteria) this;
        }

        public Criteria andStStringfield1NotBetween(String value1, String value2) {
            addCriterion("st_stringField1 not between", value1, value2, "stStringfield1");
            return (Criteria) this;
        }

        public Criteria andStStringfield2IsNull() {
            addCriterion("st_stringField2 is null");
            return (Criteria) this;
        }

        public Criteria andStStringfield2IsNotNull() {
            addCriterion("st_stringField2 is not null");
            return (Criteria) this;
        }

        public Criteria andStStringfield2EqualTo(String value) {
            addCriterion("st_stringField2 =", value, "stStringfield2");
            return (Criteria) this;
        }

        public Criteria andStStringfield2NotEqualTo(String value) {
            addCriterion("st_stringField2 <>", value, "stStringfield2");
            return (Criteria) this;
        }

        public Criteria andStStringfield2GreaterThan(String value) {
            addCriterion("st_stringField2 >", value, "stStringfield2");
            return (Criteria) this;
        }

        public Criteria andStStringfield2GreaterThanOrEqualTo(String value) {
            addCriterion("st_stringField2 >=", value, "stStringfield2");
            return (Criteria) this;
        }

        public Criteria andStStringfield2LessThan(String value) {
            addCriterion("st_stringField2 <", value, "stStringfield2");
            return (Criteria) this;
        }

        public Criteria andStStringfield2LessThanOrEqualTo(String value) {
            addCriterion("st_stringField2 <=", value, "stStringfield2");
            return (Criteria) this;
        }

        public Criteria andStStringfield2Like(String value) {
            addCriterion("st_stringField2 like", value, "stStringfield2");
            return (Criteria) this;
        }

        public Criteria andStStringfield2NotLike(String value) {
            addCriterion("st_stringField2 not like", value, "stStringfield2");
            return (Criteria) this;
        }

        public Criteria andStStringfield2In(List<String> values) {
            addCriterion("st_stringField2 in", values, "stStringfield2");
            return (Criteria) this;
        }

        public Criteria andStStringfield2NotIn(List<String> values) {
            addCriterion("st_stringField2 not in", values, "stStringfield2");
            return (Criteria) this;
        }

        public Criteria andStStringfield2Between(String value1, String value2) {
            addCriterion("st_stringField2 between", value1, value2, "stStringfield2");
            return (Criteria) this;
        }

        public Criteria andStStringfield2NotBetween(String value1, String value2) {
            addCriterion("st_stringField2 not between", value1, value2, "stStringfield2");
            return (Criteria) this;
        }

        public Criteria andStDatetimefield1IsNull() {
            addCriterion("st_datetimeField1 is null");
            return (Criteria) this;
        }

        public Criteria andStDatetimefield1IsNotNull() {
            addCriterion("st_datetimeField1 is not null");
            return (Criteria) this;
        }

        public Criteria andStDatetimefield1EqualTo(Date value) {
            addCriterion("st_datetimeField1 =", value, "stDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andStDatetimefield1NotEqualTo(Date value) {
            addCriterion("st_datetimeField1 <>", value, "stDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andStDatetimefield1GreaterThan(Date value) {
            addCriterion("st_datetimeField1 >", value, "stDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andStDatetimefield1GreaterThanOrEqualTo(Date value) {
            addCriterion("st_datetimeField1 >=", value, "stDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andStDatetimefield1LessThan(Date value) {
            addCriterion("st_datetimeField1 <", value, "stDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andStDatetimefield1LessThanOrEqualTo(Date value) {
            addCriterion("st_datetimeField1 <=", value, "stDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andStDatetimefield1In(List<Date> values) {
            addCriterion("st_datetimeField1 in", values, "stDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andStDatetimefield1NotIn(List<Date> values) {
            addCriterion("st_datetimeField1 not in", values, "stDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andStDatetimefield1Between(Date value1, Date value2) {
            addCriterion("st_datetimeField1 between", value1, value2, "stDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andStDatetimefield1NotBetween(Date value1, Date value2) {
            addCriterion("st_datetimeField1 not between", value1, value2, "stDatetimefield1");
            return (Criteria) this;
        }

        public Criteria andStDatetimefield2IsNull() {
            addCriterion("st_datetimeField2 is null");
            return (Criteria) this;
        }

        public Criteria andStDatetimefield2IsNotNull() {
            addCriterion("st_datetimeField2 is not null");
            return (Criteria) this;
        }

        public Criteria andStDatetimefield2EqualTo(Date value) {
            addCriterion("st_datetimeField2 =", value, "stDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andStDatetimefield2NotEqualTo(Date value) {
            addCriterion("st_datetimeField2 <>", value, "stDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andStDatetimefield2GreaterThan(Date value) {
            addCriterion("st_datetimeField2 >", value, "stDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andStDatetimefield2GreaterThanOrEqualTo(Date value) {
            addCriterion("st_datetimeField2 >=", value, "stDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andStDatetimefield2LessThan(Date value) {
            addCriterion("st_datetimeField2 <", value, "stDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andStDatetimefield2LessThanOrEqualTo(Date value) {
            addCriterion("st_datetimeField2 <=", value, "stDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andStDatetimefield2In(List<Date> values) {
            addCriterion("st_datetimeField2 in", values, "stDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andStDatetimefield2NotIn(List<Date> values) {
            addCriterion("st_datetimeField2 not in", values, "stDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andStDatetimefield2Between(Date value1, Date value2) {
            addCriterion("st_datetimeField2 between", value1, value2, "stDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andStDatetimefield2NotBetween(Date value1, Date value2) {
            addCriterion("st_datetimeField2 not between", value1, value2, "stDatetimefield2");
            return (Criteria) this;
        }

        public Criteria andStDatefield1IsNull() {
            addCriterion("st_dateField1 is null");
            return (Criteria) this;
        }

        public Criteria andStDatefield1IsNotNull() {
            addCriterion("st_dateField1 is not null");
            return (Criteria) this;
        }

        public Criteria andStDatefield1EqualTo(Date value) {
            addCriterionForJDBCDate("st_dateField1 =", value, "stDatefield1");
            return (Criteria) this;
        }

        public Criteria andStDatefield1NotEqualTo(Date value) {
            addCriterionForJDBCDate("st_dateField1 <>", value, "stDatefield1");
            return (Criteria) this;
        }

        public Criteria andStDatefield1GreaterThan(Date value) {
            addCriterionForJDBCDate("st_dateField1 >", value, "stDatefield1");
            return (Criteria) this;
        }

        public Criteria andStDatefield1GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("st_dateField1 >=", value, "stDatefield1");
            return (Criteria) this;
        }

        public Criteria andStDatefield1LessThan(Date value) {
            addCriterionForJDBCDate("st_dateField1 <", value, "stDatefield1");
            return (Criteria) this;
        }

        public Criteria andStDatefield1LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("st_dateField1 <=", value, "stDatefield1");
            return (Criteria) this;
        }

        public Criteria andStDatefield1In(List<Date> values) {
            addCriterionForJDBCDate("st_dateField1 in", values, "stDatefield1");
            return (Criteria) this;
        }

        public Criteria andStDatefield1NotIn(List<Date> values) {
            addCriterionForJDBCDate("st_dateField1 not in", values, "stDatefield1");
            return (Criteria) this;
        }

        public Criteria andStDatefield1Between(Date value1, Date value2) {
            addCriterionForJDBCDate("st_dateField1 between", value1, value2, "stDatefield1");
            return (Criteria) this;
        }

        public Criteria andStDatefield1NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("st_dateField1 not between", value1, value2, "stDatefield1");
            return (Criteria) this;
        }

        public Criteria andStDatefield2IsNull() {
            addCriterion("st_dateField2 is null");
            return (Criteria) this;
        }

        public Criteria andStDatefield2IsNotNull() {
            addCriterion("st_dateField2 is not null");
            return (Criteria) this;
        }

        public Criteria andStDatefield2EqualTo(Date value) {
            addCriterionForJDBCDate("st_dateField2 =", value, "stDatefield2");
            return (Criteria) this;
        }

        public Criteria andStDatefield2NotEqualTo(Date value) {
            addCriterionForJDBCDate("st_dateField2 <>", value, "stDatefield2");
            return (Criteria) this;
        }

        public Criteria andStDatefield2GreaterThan(Date value) {
            addCriterionForJDBCDate("st_dateField2 >", value, "stDatefield2");
            return (Criteria) this;
        }

        public Criteria andStDatefield2GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("st_dateField2 >=", value, "stDatefield2");
            return (Criteria) this;
        }

        public Criteria andStDatefield2LessThan(Date value) {
            addCriterionForJDBCDate("st_dateField2 <", value, "stDatefield2");
            return (Criteria) this;
        }

        public Criteria andStDatefield2LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("st_dateField2 <=", value, "stDatefield2");
            return (Criteria) this;
        }

        public Criteria andStDatefield2In(List<Date> values) {
            addCriterionForJDBCDate("st_dateField2 in", values, "stDatefield2");
            return (Criteria) this;
        }

        public Criteria andStDatefield2NotIn(List<Date> values) {
            addCriterionForJDBCDate("st_dateField2 not in", values, "stDatefield2");
            return (Criteria) this;
        }

        public Criteria andStDatefield2Between(Date value1, Date value2) {
            addCriterionForJDBCDate("st_dateField2 between", value1, value2, "stDatefield2");
            return (Criteria) this;
        }

        public Criteria andStDatefield2NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("st_dateField2 not between", value1, value2, "stDatefield2");
            return (Criteria) this;
        }

        public Criteria andStBooleanfield1IsNull() {
            addCriterion("st_booleanField1 is null");
            return (Criteria) this;
        }

        public Criteria andStBooleanfield1IsNotNull() {
            addCriterion("st_booleanField1 is not null");
            return (Criteria) this;
        }

        public Criteria andStBooleanfield1EqualTo(Boolean value) {
            addCriterion("st_booleanField1 =", value, "stBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andStBooleanfield1NotEqualTo(Boolean value) {
            addCriterion("st_booleanField1 <>", value, "stBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andStBooleanfield1GreaterThan(Boolean value) {
            addCriterion("st_booleanField1 >", value, "stBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andStBooleanfield1GreaterThanOrEqualTo(Boolean value) {
            addCriterion("st_booleanField1 >=", value, "stBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andStBooleanfield1LessThan(Boolean value) {
            addCriterion("st_booleanField1 <", value, "stBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andStBooleanfield1LessThanOrEqualTo(Boolean value) {
            addCriterion("st_booleanField1 <=", value, "stBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andStBooleanfield1In(List<Boolean> values) {
            addCriterion("st_booleanField1 in", values, "stBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andStBooleanfield1NotIn(List<Boolean> values) {
            addCriterion("st_booleanField1 not in", values, "stBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andStBooleanfield1Between(Boolean value1, Boolean value2) {
            addCriterion("st_booleanField1 between", value1, value2, "stBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andStBooleanfield1NotBetween(Boolean value1, Boolean value2) {
            addCriterion("st_booleanField1 not between", value1, value2, "stBooleanfield1");
            return (Criteria) this;
        }

        public Criteria andStBooleanfield2IsNull() {
            addCriterion("st_booleanField2 is null");
            return (Criteria) this;
        }

        public Criteria andStBooleanfield2IsNotNull() {
            addCriterion("st_booleanField2 is not null");
            return (Criteria) this;
        }

        public Criteria andStBooleanfield2EqualTo(Boolean value) {
            addCriterion("st_booleanField2 =", value, "stBooleanfield2");
            return (Criteria) this;
        }

        public Criteria andStBooleanfield2NotEqualTo(Boolean value) {
            addCriterion("st_booleanField2 <>", value, "stBooleanfield2");
            return (Criteria) this;
        }

        public Criteria andStBooleanfield2GreaterThan(Boolean value) {
            addCriterion("st_booleanField2 >", value, "stBooleanfield2");
            return (Criteria) this;
        }

        public Criteria andStBooleanfield2GreaterThanOrEqualTo(Boolean value) {
            addCriterion("st_booleanField2 >=", value, "stBooleanfield2");
            return (Criteria) this;
        }

        public Criteria andStBooleanfield2LessThan(Boolean value) {
            addCriterion("st_booleanField2 <", value, "stBooleanfield2");
            return (Criteria) this;
        }

        public Criteria andStBooleanfield2LessThanOrEqualTo(Boolean value) {
            addCriterion("st_booleanField2 <=", value, "stBooleanfield2");
            return (Criteria) this;
        }

        public Criteria andStBooleanfield2In(List<Boolean> values) {
            addCriterion("st_booleanField2 in", values, "stBooleanfield2");
            return (Criteria) this;
        }

        public Criteria andStBooleanfield2NotIn(List<Boolean> values) {
            addCriterion("st_booleanField2 not in", values, "stBooleanfield2");
            return (Criteria) this;
        }

        public Criteria andStBooleanfield2Between(Boolean value1, Boolean value2) {
            addCriterion("st_booleanField2 between", value1, value2, "stBooleanfield2");
            return (Criteria) this;
        }

        public Criteria andStBooleanfield2NotBetween(Boolean value1, Boolean value2) {
            addCriterion("st_booleanField2 not between", value1, value2, "stBooleanfield2");
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