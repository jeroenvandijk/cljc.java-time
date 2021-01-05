(ns cljc.java-time.temporal.temporal-field (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness]) (:import [java.time.temporal TemporalField]))
(clojure.core/defn get-range-unit {:arglists (quote (["java.time.temporal.TemporalField"]))} (^java.time.temporal.TemporalUnit [^java.time.temporal.TemporalField this8896] (.getRangeUnit this8896)))
(clojure.core/defn range {:arglists (quote (["java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.temporal.TemporalField this8897] (.range this8897)))
(clojure.core/defn resolve {:arglists (quote (["java.time.temporal.TemporalField" "java.util.Map" "java.time.temporal.TemporalAccessor" "java.time.format.ResolverStyle"]))} (^java.time.temporal.TemporalAccessor [^java.time.temporal.TemporalField this8898 ^java.util.Map java-util-Map8899 ^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor8900 ^java.time.format.ResolverStyle java-time-format-ResolverStyle8901] (.resolve this8898 java-util-Map8899 java-time-temporal-TemporalAccessor8900 java-time-format-ResolverStyle8901)))
(clojure.core/defn get-base-unit {:arglists (quote (["java.time.temporal.TemporalField"]))} (^java.time.temporal.TemporalUnit [^java.time.temporal.TemporalField this8902] (.getBaseUnit this8902)))
(clojure.core/defn to-string {:arglists (quote (["java.time.temporal.TemporalField"]))} (^java.lang.String [^java.time.temporal.TemporalField this8903] (.toString this8903)))
(clojure.core/defn is-date-based {:arglists (quote (["java.time.temporal.TemporalField"]))} (^java.lang.Boolean [^java.time.temporal.TemporalField this8904] (.isDateBased this8904)))
(clojure.core/defn get-display-name {:arglists (quote (["java.time.temporal.TemporalField" "java.util.Locale"]))} (^java.lang.String [^java.time.temporal.TemporalField this8905 ^java.util.Locale java-util-Locale8906] (.getDisplayName this8905 java-util-Locale8906)))
(clojure.core/defn is-supported-by {:arglists (quote (["java.time.temporal.TemporalField" "java.time.temporal.TemporalAccessor"]))} (^java.lang.Boolean [^java.time.temporal.TemporalField this8907 ^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor8908] (.isSupportedBy this8907 java-time-temporal-TemporalAccessor8908)))
(clojure.core/defn range-refined-by {:arglists (quote (["java.time.temporal.TemporalField" "java.time.temporal.TemporalAccessor"]))} (^java.time.temporal.ValueRange [^java.time.temporal.TemporalField this8909 ^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor8910] (.rangeRefinedBy this8909 java-time-temporal-TemporalAccessor8910)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.temporal.TemporalField" "java.time.temporal.Temporal" "long"]))} (^java.time.temporal.Temporal [^java.time.temporal.TemporalField this8911 ^java.time.temporal.Temporal java-time-temporal-Temporal8912 ^long long8913] (.adjustInto this8911 java-time-temporal-Temporal8912 long8913)))
(clojure.core/defn get-from {:arglists (quote (["java.time.temporal.TemporalField" "java.time.temporal.TemporalAccessor"]))} (^long [^java.time.temporal.TemporalField this8914 ^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor8915] (.getFrom this8914 java-time-temporal-TemporalAccessor8915)))
(clojure.core/defn is-time-based {:arglists (quote (["java.time.temporal.TemporalField"]))} (^java.lang.Boolean [^java.time.temporal.TemporalField this8916] (.isTimeBased this8916)))
