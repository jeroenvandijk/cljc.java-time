(ns cljc.java-time.year-month (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness]) (:import [java.time YearMonth]))
(clojure.core/defn length-of-year {:arglists (quote (["java.time.YearMonth"]))} (^java.lang.Integer [^java.time.YearMonth this12547] (.lengthOfYear this12547)))
(clojure.core/defn range {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.YearMonth this12548 ^java.time.temporal.TemporalField java-time-temporal-TemporalField12549] (.range this12548 java-time-temporal-TemporalField12549)))
(clojure.core/defn is-valid-day {:arglists (quote (["java.time.YearMonth" "int"]))} (^java.lang.Boolean [^java.time.YearMonth this12550 ^java.lang.Integer int12551] (.isValidDay this12550 int12551)))
(clojure.core/defn of {:arglists (quote (["int" "java.time.Month"] ["int" "int"]))} (^java.time.YearMonth [G__12553 G__12554] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__12553) (clojure.core/instance? (java.lang.Class/forName "java.time.Month") G__12554)) (clojure.core/let [G__12553 (clojure.core/int G__12553) G__12554 ^"java.time.Month" G__12554] (. java.time.YearMonth of G__12553 G__12554)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__12553) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__12554)) (clojure.core/let [G__12553 (clojure.core/int G__12553) G__12554 (clojure.core/int G__12554)] (. java.time.YearMonth of G__12553 G__12554)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn with-month {:arglists (quote (["java.time.YearMonth" "int"]))} (^java.time.YearMonth [^java.time.YearMonth this12555 ^java.lang.Integer int12556] (.withMonth this12555 int12556)))
(clojure.core/defn at-day {:arglists (quote (["java.time.YearMonth" "int"]))} (^java.time.LocalDate [^java.time.YearMonth this12557 ^java.lang.Integer int12558] (.atDay this12557 int12558)))
(clojure.core/defn get-year {:arglists (quote (["java.time.YearMonth"]))} (^java.lang.Integer [^java.time.YearMonth this12559] (.getYear this12559)))
(clojure.core/defn plus {:arglists (quote (["java.time.YearMonth" "long" "java.time.temporal.TemporalUnit"] ["java.time.YearMonth" "java.time.temporal.TemporalAmount"] ["java.time.YearMonth" "long" "java.time.temporal.TemporalUnit"] ["java.time.YearMonth" "java.time.temporal.TemporalAmount"]))} (^java.lang.Object [this12560 G__12561 G__12562] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__12561) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__12562)) (clojure.core/let [G__12561 (clojure.core/long G__12561) G__12562 ^"java.time.temporal.TemporalUnit" G__12562] (.plus ^java.time.YearMonth this12560 G__12561 G__12562)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__12561) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__12562)) (clojure.core/let [G__12561 (clojure.core/long G__12561) G__12562 ^"java.time.temporal.TemporalUnit" G__12562] (.plus ^java.time.YearMonth this12560 G__12561 G__12562)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))) (^java.lang.Object [this12563 G__12564] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__12564)) (clojure.core/let [G__12564 ^"java.time.temporal.TemporalAmount" G__12564] (.plus ^java.time.YearMonth this12563 G__12564)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__12564)) (clojure.core/let [G__12564 ^"java.time.temporal.TemporalAmount" G__12564] (.plus ^java.time.YearMonth this12563 G__12564)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn is-leap-year {:arglists (quote (["java.time.YearMonth"]))} (^java.lang.Boolean [^java.time.YearMonth this12565] (.isLeapYear this12565)))
(clojure.core/defn query {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.YearMonth this12566 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery12567] (.query this12566 java-time-temporal-TemporalQuery12567)))
(clojure.core/defn to-string {:arglists (quote (["java.time.YearMonth"]))} (^java.lang.String [^java.time.YearMonth this12568] (.toString this12568)))
(clojure.core/defn plus-months {:arglists (quote (["java.time.YearMonth" "long"]))} (^java.time.YearMonth [^java.time.YearMonth this12569 ^long long12570] (.plusMonths this12569 long12570)))
(clojure.core/defn is-before {:arglists (quote (["java.time.YearMonth" "java.time.YearMonth"]))} (^java.lang.Boolean [^java.time.YearMonth this12571 ^java.time.YearMonth java-time-YearMonth12572] (.isBefore this12571 java-time-YearMonth12572)))
(clojure.core/defn minus-months {:arglists (quote (["java.time.YearMonth" "long"]))} (^java.time.YearMonth [^java.time.YearMonth this12573 ^long long12574] (.minusMonths this12573 long12574)))
(clojure.core/defn minus {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalAmount"] ["java.time.YearMonth" "long" "java.time.temporal.TemporalUnit"] ["java.time.YearMonth" "long" "java.time.temporal.TemporalUnit"] ["java.time.YearMonth" "java.time.temporal.TemporalAmount"]))} (^java.lang.Object [this12575 G__12576] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__12576)) (clojure.core/let [G__12576 ^"java.time.temporal.TemporalAmount" G__12576] (.minus ^java.time.YearMonth this12575 G__12576)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__12576)) (clojure.core/let [G__12576 ^"java.time.temporal.TemporalAmount" G__12576] (.minus ^java.time.YearMonth this12575 G__12576)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))) (^java.lang.Object [this12577 G__12578 G__12579] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__12578) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__12579)) (clojure.core/let [G__12578 (clojure.core/long G__12578) G__12579 ^"java.time.temporal.TemporalUnit" G__12579] (.minus ^java.time.YearMonth this12577 G__12578 G__12579)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__12578) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__12579)) (clojure.core/let [G__12578 (clojure.core/long G__12578) G__12579 ^"java.time.temporal.TemporalUnit" G__12579] (.minus ^java.time.YearMonth this12577 G__12578 G__12579)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn get-long {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalField"]))} (^long [^java.time.YearMonth this12580 ^java.time.temporal.TemporalField java-time-temporal-TemporalField12581] (.getLong this12580 java-time-temporal-TemporalField12581)))
(clojure.core/defn with-year {:arglists (quote (["java.time.YearMonth" "int"]))} (^java.time.YearMonth [^java.time.YearMonth this12582 ^java.lang.Integer int12583] (.withYear this12582 int12583)))
(clojure.core/defn at-end-of-month {:arglists (quote (["java.time.YearMonth"]))} (^java.time.LocalDate [^java.time.YearMonth this12584] (.atEndOfMonth this12584)))
(clojure.core/defn length-of-month {:arglists (quote (["java.time.YearMonth"]))} (^java.lang.Integer [^java.time.YearMonth this12585] (.lengthOfMonth this12585)))
(clojure.core/defn until {:arglists (quote (["java.time.YearMonth" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))} (^long [^java.time.YearMonth this12586 ^java.time.temporal.Temporal java-time-temporal-Temporal12587 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit12588] (.until this12586 java-time-temporal-Temporal12587 java-time-temporal-TemporalUnit12588)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.YearMonth [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor12589] (. java.time.YearMonth from java-time-temporal-TemporalAccessor12589)))
(clojure.core/defn is-after {:arglists (quote (["java.time.YearMonth" "java.time.YearMonth"]))} (^java.lang.Boolean [^java.time.YearMonth this12590 ^java.time.YearMonth java-time-YearMonth12591] (.isAfter this12590 java-time-YearMonth12591)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalUnit"] ["java.time.YearMonth" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [this12592 G__12593] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__12593)) (clojure.core/let [G__12593 ^"java.time.temporal.TemporalUnit" G__12593] (.isSupported ^java.time.YearMonth this12592 G__12593)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__12593)) (clojure.core/let [G__12593 ^"java.time.temporal.TemporalField" G__12593] (.isSupported ^java.time.YearMonth this12592 G__12593)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn minus-years {:arglists (quote (["java.time.YearMonth" "long"]))} (^java.time.YearMonth [^java.time.YearMonth this12594 ^long long12595] (.minusYears this12594 long12595)))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))} (^java.time.YearMonth [^java.lang.CharSequence java-lang-CharSequence12596] (. java.time.YearMonth parse java-lang-CharSequence12596)) (^java.time.YearMonth [^java.lang.CharSequence java-lang-CharSequence12597 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter12598] (. java.time.YearMonth parse java-lang-CharSequence12597 java-time-format-DateTimeFormatter12598)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.YearMonth"]))} (^java.lang.Integer [^java.time.YearMonth this12599] (.hashCode this12599)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.YearMonth" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.YearMonth this12600 ^java.time.temporal.Temporal java-time-temporal-Temporal12601] (.adjustInto this12600 java-time-temporal-Temporal12601)))
(clojure.core/defn with {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalField" "long"] ["java.time.YearMonth" "java.time.temporal.TemporalField" "long"] ["java.time.YearMonth" "java.time.temporal.TemporalAdjuster"] ["java.time.YearMonth" "java.time.temporal.TemporalAdjuster"]))} (^java.lang.Object [this12602 G__12603 G__12604] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__12603) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__12604)) (clojure.core/let [G__12603 ^"java.time.temporal.TemporalField" G__12603 G__12604 (clojure.core/long G__12604)] (.with ^java.time.YearMonth this12602 G__12603 G__12604)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__12603) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__12604)) (clojure.core/let [G__12603 ^"java.time.temporal.TemporalField" G__12603 G__12604 (clojure.core/long G__12604)] (.with ^java.time.YearMonth this12602 G__12603 G__12604)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))) (^java.lang.Object [this12605 G__12606] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__12606)) (clojure.core/let [G__12606 ^"java.time.temporal.TemporalAdjuster" G__12606] (.with ^java.time.YearMonth this12605 G__12606)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__12606)) (clojure.core/let [G__12606 ^"java.time.temporal.TemporalAdjuster" G__12606] (.with ^java.time.YearMonth this12605 G__12606)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn now {:arglists (quote (["java.time.Clock"] ["java.time.ZoneId"] []))} (^java.time.YearMonth [G__12608] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.Clock") G__12608)) (clojure.core/let [G__12608 ^"java.time.Clock" G__12608] (. java.time.YearMonth now G__12608)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.ZoneId") G__12608)) (clojure.core/let [G__12608 ^"java.time.ZoneId" G__12608] (. java.time.YearMonth now G__12608)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))) (^java.time.YearMonth [] (. java.time.YearMonth now)))
(clojure.core/defn get-month-value {:arglists (quote (["java.time.YearMonth"]))} (^java.lang.Integer [^java.time.YearMonth this12609] (.getMonthValue this12609)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.YearMonth" "java.time.YearMonth"] ["java.time.YearMonth" "java.lang.Object"]))} (^java.lang.Integer [this12610 G__12611] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.YearMonth") G__12611)) (clojure.core/let [G__12611 ^"java.time.YearMonth" G__12611] (.compareTo ^java.time.YearMonth this12610 G__12611)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__12611)) (clojure.core/let [G__12611 ^"java.lang.Object" G__12611] (.compareTo ^java.time.YearMonth this12610 G__12611)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn get-month {:arglists (quote (["java.time.YearMonth"]))} (^java.time.Month [^java.time.YearMonth this12612] (.getMonth this12612)))
(clojure.core/defn get {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.YearMonth this12613 ^java.time.temporal.TemporalField java-time-temporal-TemporalField12614] (.get this12613 java-time-temporal-TemporalField12614)))
(clojure.core/defn equals {:arglists (quote (["java.time.YearMonth" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.YearMonth this12615 ^java.lang.Object java-lang-Object12616] (.equals this12615 java-lang-Object12616)))
(clojure.core/defn format {:arglists (quote (["java.time.YearMonth" "java.time.format.DateTimeFormatter"]))} (^java.lang.String [^java.time.YearMonth this12617 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter12618] (.format this12617 java-time-format-DateTimeFormatter12618)))
(clojure.core/defn plus-years {:arglists (quote (["java.time.YearMonth" "long"]))} (^java.time.YearMonth [^java.time.YearMonth this12619 ^long long12620] (.plusYears this12619 long12620)))
