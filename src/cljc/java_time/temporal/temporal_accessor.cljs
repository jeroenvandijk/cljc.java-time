(ns cljc.java-time.temporal.temporal-accessor (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness] [java.time.temporal :refer [TemporalAccessor]]))
(clojure.core/defn get {:arglists (quote (["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalField"]))} (^int [^js/JSJoda.TemporalAccessor this8794 ^js/JSJoda.TemporalField java-time-temporal-TemporalField8795] (.get this8794 java-time-temporal-TemporalField8795)))
(clojure.core/defn get-long {:arglists (quote (["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalField"]))} (^long [^js/JSJoda.TemporalAccessor this8796 ^js/JSJoda.TemporalField java-time-temporal-TemporalField8797] (.getLong this8796 java-time-temporal-TemporalField8797)))
(clojure.core/defn query {:arglists (quote (["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^js/JSJoda.TemporalAccessor this8798 ^js/JSJoda.TemporalQuery java-time-temporal-TemporalQuery8799] (.query this8798 java-time-temporal-TemporalQuery8799)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalField"]))} (^boolean [^js/JSJoda.TemporalAccessor this8800 ^js/JSJoda.TemporalField java-time-temporal-TemporalField8801] (.isSupported this8800 java-time-temporal-TemporalField8801)))
(clojure.core/defn range {:arglists (quote (["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalField"]))} (^js/JSJoda.ValueRange [^js/JSJoda.TemporalAccessor this8802 ^js/JSJoda.TemporalField java-time-temporal-TemporalField8803] (.range this8802 java-time-temporal-TemporalField8803)))
