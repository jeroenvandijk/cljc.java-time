(ns cljc.java-time.temporal.iso-fields (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness]) (:import [java.time.temporal IsoFields]))
(def week-based-year java.time.temporal.IsoFields/WEEK_BASED_YEAR)
(def week-of-week-based-year java.time.temporal.IsoFields/WEEK_OF_WEEK_BASED_YEAR)
(def quarter-years java.time.temporal.IsoFields/QUARTER_YEARS)
(def week-based-years java.time.temporal.IsoFields/WEEK_BASED_YEARS)
(def day-of-quarter java.time.temporal.IsoFields/DAY_OF_QUARTER)
(def quarter-of-year java.time.temporal.IsoFields/QUARTER_OF_YEAR)
