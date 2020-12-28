(ns cljc.java-time.month (:require [java.time :refer [Month]]) (:refer-clojure :exclude [get range format min max next name resolve short]))
(def may (. java.time.Month -MAY))
(def december (. java.time.Month -DECEMBER))
(def june (. java.time.Month -JUNE))
(def september (. java.time.Month -SEPTEMBER))
(def february (. java.time.Month -FEBRUARY))
(def january (. java.time.Month -JANUARY))
(def november (. java.time.Month -NOVEMBER))
(def august (. java.time.Month -AUGUST))
(def july (. java.time.Month -JULY))
(def march (. java.time.Month -MARCH))
(def october (. java.time.Month -OCTOBER))
(def april (. java.time.Month -APRIL))
(clojure.core/defn range {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.Month this50120 ^java.time.temporal.TemporalField java-time-temporal-TemporalField50121] (.range this50120 java-time-temporal-TemporalField50121)))
(clojure.core/defn values {:arglists (quote ([]))} (^"java.lang.Class" [] (. java.time.Month values)))
(clojure.core/defn value-of {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))} (^java.time.Month [^java.lang.String java-lang-String50122] (. java.time.Month valueOf java-lang-String50122)) (^java.lang.Enum [^java.lang.Class java-lang-Class50123 ^java.lang.String java-lang-String50124] (. java.time.Month valueOf java-lang-Class50123 java-lang-String50124)))
(clojure.core/defn of {:arglists (quote (["int"]))} (^java.time.Month [^java.lang.Integer int50125] (. java.time.Month of int50125)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this50126] (.ordinal this50126)))
(clojure.core/defn first-month-of-quarter {:arglists (quote (["java.time.Month"]))} (^java.time.Month [^java.time.Month this50127] (.firstMonthOfQuarter this50127)))
(clojure.core/defn min-length {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this50128] (.minLength this50128)))
(clojure.core/defn plus {:arglists (quote (["java.time.Month" "long"]))} (^java.time.Month [^java.time.Month this50129 ^long long50130] (.plus this50129 long50130)))
(clojure.core/defn query {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.Month this50131 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery50132] (.query this50131 java-time-temporal-TemporalQuery50132)))
(clojure.core/defn to-string {:arglists (quote (["java.time.Month"]))} (^java.lang.String [^java.time.Month this50133] (.toString this50133)))
(clojure.core/defn first-day-of-year {:arglists (quote (["java.time.Month" "boolean"]))} (^java.lang.Integer [^java.time.Month this50134 ^java.lang.Boolean boolean50135] (.firstDayOfYear this50134 boolean50135)))
(clojure.core/defn minus {:arglists (quote (["java.time.Month" "long"]))} (^java.time.Month [^java.time.Month this50136 ^long long50137] (.minus this50136 long50137)))
(clojure.core/defn get-display-name {:arglists (quote (["java.time.Month" "java.time.format.TextStyle" "java.util.Locale"]))} (^java.lang.String [^java.time.Month this50138 ^java.time.format.TextStyle java-time-format-TextStyle50139 ^java.util.Locale java-util-Locale50140] (.displayName this50138 java-time-format-TextStyle50139 java-util-Locale50140)))
(clojure.core/defn get-value {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this50141] (.value this50141)))
(clojure.core/defn max-length {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this50142] (.maxLength this50142)))
(clojure.core/defn name {:arglists (quote (["java.time.Month"]))} (^java.lang.String [^java.time.Month this50143] (.name this50143)))
(clojure.core/defn get-long {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^long [^java.time.Month this50144 ^java.time.temporal.TemporalField java-time-temporal-TemporalField50145] (.getLong this50144 java-time-temporal-TemporalField50145)))
(clojure.core/defn length {:arglists (quote (["java.time.Month" "boolean"]))} (^java.lang.Integer [^java.time.Month this50146 ^java.lang.Boolean boolean50147] (.length this50146 boolean50147)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.Month"]))} (^java.lang.Class [^java.time.Month this50148] (.declaringClass this50148)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.Month [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor50149] (. java.time.Month from java-time-temporal-TemporalAccessor50149)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [^java.time.Month this50150 ^java.time.temporal.TemporalField java-time-temporal-TemporalField50151] (.isSupported this50150 java-time-temporal-TemporalField50151)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this50152] (.hashCode this50152)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.Month" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.Month this50153 ^java.time.temporal.Temporal java-time-temporal-Temporal50154] (.adjustInto this50153 java-time-temporal-Temporal50154)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.Month" "java.lang.Object"] ["java.time.Month" "java.lang.Enum"]))} (^java.lang.Integer [this50155 G__50156] (.compareTo ^java.time.Month this50155 G__50156)))
(clojure.core/defn get {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.Month this50157 ^java.time.temporal.TemporalField java-time-temporal-TemporalField50158] (.get this50157 java-time-temporal-TemporalField50158)))
(clojure.core/defn equals {:arglists (quote (["java.time.Month" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.Month this50159 ^java.lang.Object java-lang-Object50160] (.equals this50159 java-lang-Object50160)))