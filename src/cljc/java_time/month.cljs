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
(clojure.core/defn range {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^js/JSJoda.ValueRange [^js/JSJoda.Month this7895 ^js/JSJoda.TemporalField java-time-temporal-TemporalField7896] (.range this7895 java-time-temporal-TemporalField7896)))
(clojure.core/defn values {:arglists (quote ([]))} (^"java.lang.Class" [] (js-invoke java.time.Month "values")))
(clojure.core/defn value-of {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))} (^js/JSJoda.Month [^java.lang.String java-lang-String7897] (js-invoke java.time.Month "valueOf" java-lang-String7897)) (^java.lang.Enum [^java.lang.Class java-lang-Class7898 ^java.lang.String java-lang-String7899] (js-invoke java.time.Month "valueOf" java-lang-Class7898 java-lang-String7899)))
(clojure.core/defn of {:arglists (quote (["int"]))} (^js/JSJoda.Month [^int int7900] (js-invoke java.time.Month "of" int7900)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.Month"]))} (^int [^js/JSJoda.Month this7901] (.ordinal this7901)))
(clojure.core/defn first-month-of-quarter {:arglists (quote (["java.time.Month"]))} (^js/JSJoda.Month [^js/JSJoda.Month this7902] (.firstMonthOfQuarter this7902)))
(clojure.core/defn min-length {:arglists (quote (["java.time.Month"]))} (^int [^js/JSJoda.Month this7903] (.minLength this7903)))
(clojure.core/defn plus {:arglists (quote (["java.time.Month" "long"]))} (^js/JSJoda.Month [^js/JSJoda.Month this7904 ^long long7905] (.plus this7904 long7905)))
(clojure.core/defn query {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^js/JSJoda.Month this7906 ^js/JSJoda.TemporalQuery java-time-temporal-TemporalQuery7907] (.query this7906 java-time-temporal-TemporalQuery7907)))
(clojure.core/defn to-string {:arglists (quote (["java.time.Month"]))} (^java.lang.String [^js/JSJoda.Month this7908] (.toString this7908)))
(clojure.core/defn first-day-of-year {:arglists (quote (["java.time.Month" "boolean"]))} (^int [^js/JSJoda.Month this7909 ^boolean boolean7910] (.firstDayOfYear this7909 boolean7910)))
(clojure.core/defn minus {:arglists (quote (["java.time.Month" "long"]))} (^js/JSJoda.Month [^js/JSJoda.Month this7911 ^long long7912] (.minus this7911 long7912)))
(clojure.core/defn get-display-name {:arglists (quote (["java.time.Month" "java.time.format.TextStyle" "java.util.Locale"]))} (^java.lang.String [^js/JSJoda.Month this7913 ^js/JSJoda.TextStyle java-time-format-TextStyle7914 ^java.util.Locale java-util-Locale7915] (.displayName this7913 java-time-format-TextStyle7914 java-util-Locale7915)))
(clojure.core/defn get-value {:arglists (quote (["java.time.Month"]))} (^int [^js/JSJoda.Month this7916] (.value this7916)))
(clojure.core/defn max-length {:arglists (quote (["java.time.Month"]))} (^int [^js/JSJoda.Month this7917] (.maxLength this7917)))
(clojure.core/defn name {:arglists (quote (["java.time.Month"]))} (^java.lang.String [^js/JSJoda.Month this7918] (.name this7918)))
(clojure.core/defn get-long {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^long [^js/JSJoda.Month this7919 ^js/JSJoda.TemporalField java-time-temporal-TemporalField7920] (.getLong this7919 java-time-temporal-TemporalField7920)))
(clojure.core/defn length {:arglists (quote (["java.time.Month" "boolean"]))} (^int [^js/JSJoda.Month this7921 ^boolean boolean7922] (.length this7921 boolean7922)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.Month"]))} (^java.lang.Class [^js/JSJoda.Month this7923] (.declaringClass this7923)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^js/JSJoda.Month [^js/JSJoda.TemporalAccessor java-time-temporal-TemporalAccessor7924] (js-invoke java.time.Month "from" java-time-temporal-TemporalAccessor7924)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^boolean [^js/JSJoda.Month this7925 ^js/JSJoda.TemporalField java-time-temporal-TemporalField7926] (.isSupported this7925 java-time-temporal-TemporalField7926)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.Month"]))} (^int [^js/JSJoda.Month this7927] (.hashCode this7927)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.Month" "java.time.temporal.Temporal"]))} (^js/JSJoda.Temporal [^js/JSJoda.Month this7928 ^js/JSJoda.Temporal java-time-temporal-Temporal7929] (.adjustInto this7928 java-time-temporal-Temporal7929)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.Month" "java.lang.Object"] ["java.time.Month" "java.lang.Enum"]))} (^int [this7930 G__7931] (.compareTo ^js/JSJoda.Month this7930 G__7931)))
(clojure.core/defn get {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^int [^js/JSJoda.Month this7932 ^js/JSJoda.TemporalField java-time-temporal-TemporalField7933] (.get this7932 java-time-temporal-TemporalField7933)))
(clojure.core/defn equals {:arglists (quote (["java.time.Month" "java.lang.Object"]))} (^boolean [^js/JSJoda.Month this7934 ^java.lang.Object java-lang-Object7935] (.equals this7934 java-lang-Object7935)))
