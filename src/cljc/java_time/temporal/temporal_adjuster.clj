(ns cljc.java-time.temporal.temporal-adjuster (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness]) (:import [java.time.temporal TemporalAdjuster]))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.temporal.TemporalAdjuster" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.temporal.TemporalAdjuster this8804 ^java.time.temporal.Temporal java-time-temporal-Temporal8805] (.adjustInto this8804 java-time-temporal-Temporal8805)))
