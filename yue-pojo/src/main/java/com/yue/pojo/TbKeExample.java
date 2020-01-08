package com.yue.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbKeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbKeExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andKeIdIsNull() {
            addCriterion("ke_id is null");
            return (Criteria) this;
        }

        public Criteria andKeIdIsNotNull() {
            addCriterion("ke_id is not null");
            return (Criteria) this;
        }

        public Criteria andKeIdEqualTo(String value) {
            addCriterion("ke_id =", value, "keId");
            return (Criteria) this;
        }

        public Criteria andKeIdNotEqualTo(String value) {
            addCriterion("ke_id <>", value, "keId");
            return (Criteria) this;
        }

        public Criteria andKeIdGreaterThan(String value) {
            addCriterion("ke_id >", value, "keId");
            return (Criteria) this;
        }

        public Criteria andKeIdGreaterThanOrEqualTo(String value) {
            addCriterion("ke_id >=", value, "keId");
            return (Criteria) this;
        }

        public Criteria andKeIdLessThan(String value) {
            addCriterion("ke_id <", value, "keId");
            return (Criteria) this;
        }

        public Criteria andKeIdLessThanOrEqualTo(String value) {
            addCriterion("ke_id <=", value, "keId");
            return (Criteria) this;
        }

        public Criteria andKeIdLike(String value) {
            addCriterion("ke_id like", value, "keId");
            return (Criteria) this;
        }

        public Criteria andKeIdNotLike(String value) {
            addCriterion("ke_id not like", value, "keId");
            return (Criteria) this;
        }

        public Criteria andKeIdIn(List<String> values) {
            addCriterion("ke_id in", values, "keId");
            return (Criteria) this;
        }

        public Criteria andKeIdNotIn(List<String> values) {
            addCriterion("ke_id not in", values, "keId");
            return (Criteria) this;
        }

        public Criteria andKeIdBetween(String value1, String value2) {
            addCriterion("ke_id between", value1, value2, "keId");
            return (Criteria) this;
        }

        public Criteria andKeIdNotBetween(String value1, String value2) {
            addCriterion("ke_id not between", value1, value2, "keId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andTeacherIsNull() {
            addCriterion("teacher is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIsNotNull() {
            addCriterion("teacher is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEqualTo(String value) {
            addCriterion("teacher =", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotEqualTo(String value) {
            addCriterion("teacher <>", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherGreaterThan(String value) {
            addCriterion("teacher >", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("teacher >=", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLessThan(String value) {
            addCriterion("teacher <", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLessThanOrEqualTo(String value) {
            addCriterion("teacher <=", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLike(String value) {
            addCriterion("teacher like", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotLike(String value) {
            addCriterion("teacher not like", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherIn(List<String> values) {
            addCriterion("teacher in", values, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotIn(List<String> values) {
            addCriterion("teacher not in", values, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherBetween(String value1, String value2) {
            addCriterion("teacher between", value1, value2, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotBetween(String value1, String value2) {
            addCriterion("teacher not between", value1, value2, "teacher");
            return (Criteria) this;
        }

        public Criteria andImagesIsNull() {
            addCriterion("images is null");
            return (Criteria) this;
        }

        public Criteria andImagesIsNotNull() {
            addCriterion("images is not null");
            return (Criteria) this;
        }

        public Criteria andImagesEqualTo(String value) {
            addCriterion("images =", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotEqualTo(String value) {
            addCriterion("images <>", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThan(String value) {
            addCriterion("images >", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThanOrEqualTo(String value) {
            addCriterion("images >=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThan(String value) {
            addCriterion("images <", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThanOrEqualTo(String value) {
            addCriterion("images <=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLike(String value) {
            addCriterion("images like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotLike(String value) {
            addCriterion("images not like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesIn(List<String> values) {
            addCriterion("images in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotIn(List<String> values) {
            addCriterion("images not in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesBetween(String value1, String value2) {
            addCriterion("images between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotBetween(String value1, String value2) {
            addCriterion("images not between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andKkDateIsNull() {
            addCriterion("kk_date is null");
            return (Criteria) this;
        }

        public Criteria andKkDateIsNotNull() {
            addCriterion("kk_date is not null");
            return (Criteria) this;
        }

        public Criteria andKkDateEqualTo(Date value) {
            addCriterion("kk_date =", value, "kkDate");
            return (Criteria) this;
        }

        public Criteria andKkDateNotEqualTo(Date value) {
            addCriterion("kk_date <>", value, "kkDate");
            return (Criteria) this;
        }

        public Criteria andKkDateGreaterThan(Date value) {
            addCriterion("kk_date >", value, "kkDate");
            return (Criteria) this;
        }

        public Criteria andKkDateGreaterThanOrEqualTo(Date value) {
            addCriterion("kk_date >=", value, "kkDate");
            return (Criteria) this;
        }

        public Criteria andKkDateLessThan(Date value) {
            addCriterion("kk_date <", value, "kkDate");
            return (Criteria) this;
        }

        public Criteria andKkDateLessThanOrEqualTo(Date value) {
            addCriterion("kk_date <=", value, "kkDate");
            return (Criteria) this;
        }

        public Criteria andKkDateIn(List<Date> values) {
            addCriterion("kk_date in", values, "kkDate");
            return (Criteria) this;
        }

        public Criteria andKkDateNotIn(List<Date> values) {
            addCriterion("kk_date not in", values, "kkDate");
            return (Criteria) this;
        }

        public Criteria andKkDateBetween(Date value1, Date value2) {
            addCriterion("kk_date between", value1, value2, "kkDate");
            return (Criteria) this;
        }

        public Criteria andKkDateNotBetween(Date value1, Date value2) {
            addCriterion("kk_date not between", value1, value2, "kkDate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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