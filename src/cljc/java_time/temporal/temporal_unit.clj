(ns cljc.java-time.temporal.temporal-unit (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness]) (:import [java.time.temporal TemporalUnit]))
(clojure.core/defn is-supported-by {:arglists (quote (["java.time.temporal.TemporalUnit" "java.time.temporal.Temporal"]))} (^java.lang.Boolean [^java.time.temporal.ChronoUnit this15369 ^java.time.temporal.Temporal java-time-temporal-Temporal15370] (.isSupportedBy this15369 java-time-temporal-Temporal15370)))
(clojure.core/defn is-time-based {:arglists (quote (["java.time.temporal.TemporalUnit"]))} (^java.lang.Boolean [^java.time.temporal.ChronoUnit this15371] (.isTimeBased this15371)))
(clojure.core/defn get-duration {:arglists (quote (["java.time.temporal.TemporalUnit"]))} (^java.time.Duration [^java.time.temporal.ChronoUnit this15372] (.getDuration this15372)))
(clojure.core/defn add-to {:arglists (quote (["java.time.temporal.TemporalUnit" "java.time.temporal.Temporal" "long"]))} (^java.time.temporal.Temporal [^java.time.temporal.ChronoUnit this15373 ^java.time.temporal.Temporal java-time-temporal-Temporal15374 ^long long15375] (.addTo this15373 java-time-temporal-Temporal15374 long15375)))
(clojure.core/defn between {:arglists (quote (["java.time.temporal.TemporalUnit" "java.time.temporal.Temporal" "java.time.temporal.Temporal"]))} (^long [^java.time.temporal.ChronoUnit this15376 ^java.time.temporal.Temporal java-time-temporal-Temporal15377 ^java.time.temporal.Temporal java-time-temporal-Temporal15378] (.between this15376 java-time-temporal-Temporal15377 java-time-temporal-Temporal15378)))
(clojure.core/defn is-date-based {:arglists (quote (["java.time.temporal.TemporalUnit"]))} (^java.lang.Boolean [^java.time.temporal.ChronoUnit this15379] (.isDateBased this15379)))
(clojure.core/defn is-duration-estimated {:arglists (quote (["java.time.temporal.TemporalUnit"]))} (^java.lang.Boolean [^java.time.temporal.ChronoUnit this15380] (.isDurationEstimated this15380)))
(clojure.core/defn to-string {:arglists (quote (["java.time.temporal.TemporalUnit"]))} (^java.lang.String [^java.time.temporal.ChronoUnit this15381] (.toString this15381)))
