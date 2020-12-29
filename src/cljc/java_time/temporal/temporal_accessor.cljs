(ns cljc.java-time.temporal.temporal-accessor (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness] [java.time.temporal :refer [TemporalAccessor]]))
(clojure.core/defn get {:arglists (quote (["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalField"]))} (^int [^js/JSJoda.TemporalAccessor this61510 ^js/JSJoda.TemporalField java-time-temporal-TemporalField61511] (.get this61510 java-time-temporal-TemporalField61511)))
(clojure.core/defn get-long {:arglists (quote (["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalField"]))} (^long [^js/JSJoda.TemporalAccessor this61512 ^js/JSJoda.TemporalField java-time-temporal-TemporalField61513] (.getLong this61512 java-time-temporal-TemporalField61513)))
(clojure.core/defn query {:arglists (quote (["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^js/JSJoda.TemporalAccessor this61514 ^js/JSJoda.TemporalQuery java-time-temporal-TemporalQuery61515] (.query this61514 java-time-temporal-TemporalQuery61515)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalField"]))} (^boolean [^js/JSJoda.TemporalAccessor this61516 ^js/JSJoda.TemporalField java-time-temporal-TemporalField61517] (.isSupported this61516 java-time-temporal-TemporalField61517)))
(clojure.core/defn range {:arglists (quote (["java.time.temporal.TemporalAccessor" "java.time.temporal.TemporalField"]))} (^js/JSJoda.ValueRange [^js/JSJoda.TemporalAccessor this61518 ^js/JSJoda.TemporalField java-time-temporal-TemporalField61519] (.range this61518 java-time-temporal-TemporalField61519)))
