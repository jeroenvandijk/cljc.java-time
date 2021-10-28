(ns cljc.java-time.period (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness]) (:import [java.time Period]))
(def zero java.time.Period/ZERO)
(clojure.core/defn get-months {:arglists (quote (["java.time.Period"]))} (^java.lang.Integer [^java.time.Period this12553] (.getMonths this12553)))
(clojure.core/defn of-weeks {:arglists (quote (["int"]))} (^java.time.Period [^java.lang.Integer int12554] (java.time.Period/ofWeeks int12554)))
(clojure.core/defn of-days {:arglists (quote (["int"]))} (^java.time.Period [^java.lang.Integer int12555] (java.time.Period/ofDays int12555)))
(clojure.core/defn is-negative {:arglists (quote (["java.time.Period"]))} (^java.lang.Boolean [^java.time.Period this12556] (.isNegative this12556)))
(clojure.core/defn of {:arglists (quote (["int" "int" "int"]))} (^java.time.Period [^java.lang.Integer int12557 ^java.lang.Integer int12558 ^java.lang.Integer int12559] (java.time.Period/of int12557 int12558 int12559)))
(clojure.core/defn is-zero {:arglists (quote (["java.time.Period"]))} (^java.lang.Boolean [^java.time.Period this12560] (.isZero this12560)))
(clojure.core/defn multiplied-by {:arglists (quote (["java.time.Period" "int"]))} (^java.time.Period [^java.time.Period this12561 ^java.lang.Integer int12562] (.multipliedBy this12561 int12562)))
(clojure.core/defn get-units {:arglists (quote (["java.time.Period"]))} (^java.util.List [^java.time.Period this12563] (.getUnits this12563)))
(clojure.core/defn with-days {:arglists (quote (["java.time.Period" "int"]))} (^java.time.Period [^java.time.Period this12564 ^java.lang.Integer int12565] (.withDays this12564 int12565)))
(clojure.core/defn plus {:arglists (quote (["java.time.Period" "java.time.temporal.TemporalAmount"]))} (^java.time.Period [^java.time.Period this12566 ^java.time.temporal.TemporalAmount java-time-temporal-TemporalAmount12567] (.plus this12566 java-time-temporal-TemporalAmount12567)))
(clojure.core/defn of-months {:arglists (quote (["int"]))} (^java.time.Period [^java.lang.Integer int12568] (java.time.Period/ofMonths int12568)))
(clojure.core/defn to-string {:arglists (quote (["java.time.Period"]))} (^java.lang.String [^java.time.Period this12569] (.toString this12569)))
(clojure.core/defn plus-months {:arglists (quote (["java.time.Period" "long"]))} (^java.time.Period [^java.time.Period this12570 ^long long12571] (.plusMonths this12570 long12571)))
(clojure.core/defn minus-months {:arglists (quote (["java.time.Period" "long"]))} (^java.time.Period [^java.time.Period this12572 ^long long12573] (.minusMonths this12572 long12573)))
(clojure.core/defn minus {:arglists (quote (["java.time.Period" "java.time.temporal.TemporalAmount"]))} (^java.time.Period [^java.time.Period this12574 ^java.time.temporal.TemporalAmount java-time-temporal-TemporalAmount12575] (.minus this12574 java-time-temporal-TemporalAmount12575)))
(clojure.core/defn add-to {:arglists (quote (["java.time.Period" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.Period this12576 ^java.time.temporal.Temporal java-time-temporal-Temporal12577] (.addTo this12576 java-time-temporal-Temporal12577)))
(clojure.core/defn to-total-months {:arglists (quote (["java.time.Period"]))} (^long [^java.time.Period this12578] (.toTotalMonths this12578)))
(clojure.core/defn plus-days {:arglists (quote (["java.time.Period" "long"]))} (^java.time.Period [^java.time.Period this12579 ^long long12580] (.plusDays this12579 long12580)))
(clojure.core/defn of-years {:arglists (quote (["int"]))} (^java.time.Period [^java.lang.Integer int12581] (java.time.Period/ofYears int12581)))
(clojure.core/defn get-days {:arglists (quote (["java.time.Period"]))} (^java.lang.Integer [^java.time.Period this12582] (.getDays this12582)))
(clojure.core/defn negated {:arglists (quote (["java.time.Period"]))} (^java.time.Period [^java.time.Period this12583] (.negated this12583)))
(clojure.core/defn get-years {:arglists (quote (["java.time.Period"]))} (^java.lang.Integer [^java.time.Period this12584] (.getYears this12584)))
(clojure.core/defn with-years {:arglists (quote (["java.time.Period" "int"]))} (^java.time.Period [^java.time.Period this12585 ^java.lang.Integer int12586] (.withYears this12585 int12586)))
(clojure.core/defn normalized {:arglists (quote (["java.time.Period"]))} (^java.time.Period [^java.time.Period this12587] (.normalized this12587)))
(clojure.core/defn with-months {:arglists (quote (["java.time.Period" "int"]))} (^java.time.Period [^java.time.Period this12588 ^java.lang.Integer int12589] (.withMonths this12588 int12589)))
(clojure.core/defn between {:arglists (quote (["java.time.LocalDate" "java.time.LocalDate"]))} (^java.time.Period [^java.time.LocalDate java-time-LocalDate12590 ^java.time.LocalDate java-time-LocalDate12591] (java.time.Period/between java-time-LocalDate12590 java-time-LocalDate12591)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAmount"]))} (^java.time.Period [^java.time.temporal.TemporalAmount java-time-temporal-TemporalAmount12592] (java.time.Period/from java-time-temporal-TemporalAmount12592)))
(clojure.core/defn minus-years {:arglists (quote (["java.time.Period" "long"]))} (^java.time.Period [^java.time.Period this12593 ^long long12594] (.minusYears this12593 long12594)))
(clojure.core/defn get-chronology {:arglists (quote (["java.time.Period"]))} (^java.time.chrono.IsoChronology [^java.time.Period this12595] (.getChronology this12595)))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence"]))} (^java.time.Period [^java.lang.CharSequence java-lang-CharSequence12596] (java.time.Period/parse java-lang-CharSequence12596)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.Period"]))} (^java.lang.Integer [^java.time.Period this12597] (.hashCode this12597)))
(clojure.core/defn subtract-from {:arglists (quote (["java.time.Period" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.Period this12598 ^java.time.temporal.Temporal java-time-temporal-Temporal12599] (.subtractFrom this12598 java-time-temporal-Temporal12599)))
(clojure.core/defn get {:arglists (quote (["java.time.Period" "java.time.temporal.TemporalUnit"]))} (^long [^java.time.Period this12600 ^java.time.temporal.ChronoUnit java-time-temporal-TemporalUnit12601] (.get this12600 java-time-temporal-TemporalUnit12601)))
(clojure.core/defn equals {:arglists (quote (["java.time.Period" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.Period this12602 ^java.lang.Object java-lang-Object12603] (.equals this12602 java-lang-Object12603)))
(clojure.core/defn plus-years {:arglists (quote (["java.time.Period" "long"]))} (^java.time.Period [^java.time.Period this12604 ^long long12605] (.plusYears this12604 long12605)))
(clojure.core/defn minus-days {:arglists (quote (["java.time.Period" "long"]))} (^java.time.Period [^java.time.Period this12606 ^long long12607] (.minusDays this12606 long12607)))
