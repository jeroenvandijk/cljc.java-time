(ns cljc.java-time.temporal.temporal-query (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness]) (:import [java.time.temporal TemporalQuery]))
(clojure.core/defn query-from {:arglists (quote (["java.time.temporal.TemporalQuery" "java.time.temporal.TemporalAccessor"]))} (^java.lang.Object [^java.time.temporal.TemporalQuery this15365 ^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor15366] (.queryFrom this15365 java-time-temporal-TemporalAccessor15366)))
