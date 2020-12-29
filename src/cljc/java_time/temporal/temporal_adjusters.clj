(ns cljc.java-time.temporal.temporal-adjusters (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness]) (:import [java.time.temporal TemporalAdjusters]))
(clojure.core/defn next {:arglists (quote (["java.time.DayOfWeek"]))} (^java.time.temporal.TemporalAdjuster [^java.time.DayOfWeek java-time-DayOfWeek61292] (java.time.temporal.TemporalAdjusters/next java-time-DayOfWeek61292)))
(clojure.core/defn next-or-same {:arglists (quote (["java.time.DayOfWeek"]))} (^java.time.temporal.TemporalAdjuster [^java.time.DayOfWeek java-time-DayOfWeek61293] (java.time.temporal.TemporalAdjusters/nextOrSame java-time-DayOfWeek61293)))
(clojure.core/defn first-day-of-next-month {:arglists (quote ([]))} (^java.time.temporal.TemporalAdjuster [] (java.time.temporal.TemporalAdjusters/firstDayOfNextMonth)))
(clojure.core/defn first-day-of-month {:arglists (quote ([]))} (^java.time.temporal.TemporalAdjuster [] (java.time.temporal.TemporalAdjusters/firstDayOfMonth)))
(clojure.core/defn first-day-of-year {:arglists (quote ([]))} (^java.time.temporal.TemporalAdjuster [] (java.time.temporal.TemporalAdjusters/firstDayOfYear)))
(clojure.core/defn of-date-adjuster {:arglists (quote (["java.util.function.UnaryOperator"]))} (^java.time.temporal.TemporalAdjuster [^java.util.function.UnaryOperator java-util-function-UnaryOperator61294] (java.time.temporal.TemporalAdjusters/ofDateAdjuster java-util-function-UnaryOperator61294)))
(clojure.core/defn last-day-of-year {:arglists (quote ([]))} (^java.time.temporal.TemporalAdjuster [] (java.time.temporal.TemporalAdjusters/lastDayOfYear)))
(clojure.core/defn first-in-month {:arglists (quote (["java.time.DayOfWeek"]))} (^java.time.temporal.TemporalAdjuster [^java.time.DayOfWeek java-time-DayOfWeek61295] (java.time.temporal.TemporalAdjusters/firstInMonth java-time-DayOfWeek61295)))
(clojure.core/defn previous-or-same {:arglists (quote (["java.time.DayOfWeek"]))} (^java.time.temporal.TemporalAdjuster [^java.time.DayOfWeek java-time-DayOfWeek61296] (java.time.temporal.TemporalAdjusters/previousOrSame java-time-DayOfWeek61296)))
(clojure.core/defn previous {:arglists (quote (["java.time.DayOfWeek"]))} (^java.time.temporal.TemporalAdjuster [^java.time.DayOfWeek java-time-DayOfWeek61297] (java.time.temporal.TemporalAdjusters/previous java-time-DayOfWeek61297)))
(clojure.core/defn last-day-of-month {:arglists (quote ([]))} (^java.time.temporal.TemporalAdjuster [] (java.time.temporal.TemporalAdjusters/lastDayOfMonth)))
(clojure.core/defn last-in-month {:arglists (quote (["java.time.DayOfWeek"]))} (^java.time.temporal.TemporalAdjuster [^java.time.DayOfWeek java-time-DayOfWeek61298] (java.time.temporal.TemporalAdjusters/lastInMonth java-time-DayOfWeek61298)))
(clojure.core/defn first-day-of-next-year {:arglists (quote ([]))} (^java.time.temporal.TemporalAdjuster [] (java.time.temporal.TemporalAdjusters/firstDayOfNextYear)))
(clojure.core/defn day-of-week-in-month {:arglists (quote (["int" "java.time.DayOfWeek"]))} (^java.time.temporal.TemporalAdjuster [^java.lang.Integer int61299 ^java.time.DayOfWeek java-time-DayOfWeek61300] (java.time.temporal.TemporalAdjusters/dayOfWeekInMonth int61299 java-time-DayOfWeek61300)))
