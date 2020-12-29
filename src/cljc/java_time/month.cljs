(ns cljc.java-time.month (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness] [java.time :refer [Month]]))
(def may (goog.object/get java.time.Month "MAY"))
(def december (goog.object/get java.time.Month "DECEMBER"))
(def june (goog.object/get java.time.Month "JUNE"))
(def september (goog.object/get java.time.Month "SEPTEMBER"))
(def february (goog.object/get java.time.Month "FEBRUARY"))
(def january (goog.object/get java.time.Month "JANUARY"))
(def november (goog.object/get java.time.Month "NOVEMBER"))
(def august (goog.object/get java.time.Month "AUGUST"))
(def july (goog.object/get java.time.Month "JULY"))
(def march (goog.object/get java.time.Month "MARCH"))
(def october (goog.object/get java.time.Month "OCTOBER"))
(def april (goog.object/get java.time.Month "APRIL"))
(clojure.core/defn range {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^js/JSJoda.ValueRange [^js/JSJoda.Month this60611 ^js/JSJoda.TemporalField java-time-temporal-TemporalField60612] (.range this60611 java-time-temporal-TemporalField60612)))
(clojure.core/defn values {:arglists (quote ([]))} (^"java.lang.Class" [] (js-invoke java.time.Month "values")))
(clojure.core/defn value-of {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))} (^js/JSJoda.Month [^java.lang.String java-lang-String60613] (js-invoke java.time.Month "valueOf" java-lang-String60613)) (^java.lang.Enum [^java.lang.Class java-lang-Class60614 ^java.lang.String java-lang-String60615] (js-invoke java.time.Month "valueOf" java-lang-Class60614 java-lang-String60615)))
(clojure.core/defn of {:arglists (quote (["int"]))} (^js/JSJoda.Month [^int int60616] (js-invoke java.time.Month "of" int60616)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.Month"]))} (^int [^js/JSJoda.Month this60617] (.ordinal this60617)))
(clojure.core/defn first-month-of-quarter {:arglists (quote (["java.time.Month"]))} (^js/JSJoda.Month [^js/JSJoda.Month this60618] (.firstMonthOfQuarter this60618)))
(clojure.core/defn min-length {:arglists (quote (["java.time.Month"]))} (^int [^js/JSJoda.Month this60619] (.minLength this60619)))
(clojure.core/defn plus {:arglists (quote (["java.time.Month" "long"]))} (^js/JSJoda.Month [^js/JSJoda.Month this60620 ^long long60621] (.plus this60620 long60621)))
(clojure.core/defn query {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^js/JSJoda.Month this60622 ^js/JSJoda.TemporalQuery java-time-temporal-TemporalQuery60623] (.query this60622 java-time-temporal-TemporalQuery60623)))
(clojure.core/defn to-string {:arglists (quote (["java.time.Month"]))} (^java.lang.String [^js/JSJoda.Month this60624] (.toString this60624)))
(clojure.core/defn first-day-of-year {:arglists (quote (["java.time.Month" "boolean"]))} (^int [^js/JSJoda.Month this60625 ^boolean boolean60626] (.firstDayOfYear this60625 boolean60626)))
(clojure.core/defn minus {:arglists (quote (["java.time.Month" "long"]))} (^js/JSJoda.Month [^js/JSJoda.Month this60627 ^long long60628] (.minus this60627 long60628)))
(clojure.core/defn get-display-name {:arglists (quote (["java.time.Month" "java.time.format.TextStyle" "java.util.Locale"]))} (^java.lang.String [^js/JSJoda.Month this60629 ^js/JSJoda.TextStyle java-time-format-TextStyle60630 ^java.util.Locale java-util-Locale60631] (.displayName this60629 java-time-format-TextStyle60630 java-util-Locale60631)))
(clojure.core/defn get-value {:arglists (quote (["java.time.Month"]))} (^int [^js/JSJoda.Month this60632] (.value this60632)))
(clojure.core/defn max-length {:arglists (quote (["java.time.Month"]))} (^int [^js/JSJoda.Month this60633] (.maxLength this60633)))
(clojure.core/defn name {:arglists (quote (["java.time.Month"]))} (^java.lang.String [^js/JSJoda.Month this60634] (.name this60634)))
(clojure.core/defn get-long {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^long [^js/JSJoda.Month this60635 ^js/JSJoda.TemporalField java-time-temporal-TemporalField60636] (.getLong this60635 java-time-temporal-TemporalField60636)))
(clojure.core/defn length {:arglists (quote (["java.time.Month" "boolean"]))} (^int [^js/JSJoda.Month this60637 ^boolean boolean60638] (.length this60637 boolean60638)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.Month"]))} (^java.lang.Class [^js/JSJoda.Month this60639] (.declaringClass this60639)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^js/JSJoda.Month [^js/JSJoda.TemporalAccessor java-time-temporal-TemporalAccessor60640] (js-invoke java.time.Month "from" java-time-temporal-TemporalAccessor60640)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^boolean [^js/JSJoda.Month this60641 ^js/JSJoda.TemporalField java-time-temporal-TemporalField60642] (.isSupported this60641 java-time-temporal-TemporalField60642)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.Month"]))} (^int [^js/JSJoda.Month this60643] (.hashCode this60643)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.Month" "java.time.temporal.Temporal"]))} (^js/JSJoda.Temporal [^js/JSJoda.Month this60644 ^js/JSJoda.Temporal java-time-temporal-Temporal60645] (.adjustInto this60644 java-time-temporal-Temporal60645)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.Month" "java.lang.Object"] ["java.time.Month" "java.lang.Enum"]))} (^int [this60646 G__60647] (.compareTo ^js/JSJoda.Month this60646 G__60647)))
(clojure.core/defn get {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^int [^js/JSJoda.Month this60648 ^js/JSJoda.TemporalField java-time-temporal-TemporalField60649] (.get this60648 java-time-temporal-TemporalField60649)))
(clojure.core/defn equals {:arglists (quote (["java.time.Month" "java.lang.Object"]))} (^boolean [^js/JSJoda.Month this60650 ^java.lang.Object java-lang-Object60651] (.equals this60650 java-lang-Object60651)))
