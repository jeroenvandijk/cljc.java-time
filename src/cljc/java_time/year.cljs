(ns cljc.java-time.year (:require [java.time :refer [Year]]) (:refer-clojure :exclude [get range format min max next name resolve short]))
(def min-value (. java.time.Year -MIN_VALUE))
(def max-value (. java.time.Year -MAX_VALUE))
(clojure.core/defn range {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.Year this50476 ^java.time.temporal.TemporalField java-time-temporal-TemporalField50477] (.range this50476 java-time-temporal-TemporalField50477)))
(clojure.core/defn of {:arglists (quote (["int"]))} (^java.time.Year [^java.lang.Integer int50478] (. java.time.Year of int50478)))
(clojure.core/defn at-day {:arglists (quote (["java.time.Year" "int"]))} (^java.time.LocalDate [^java.time.Year this50479 ^java.lang.Integer int50480] (.atDay this50479 int50480)))
(clojure.core/defn plus {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalAmount"] ["java.time.Year" "long" "java.time.temporal.TemporalUnit"] ["java.time.Year" "java.time.temporal.TemporalAmount"] ["java.time.Year" "long" "java.time.temporal.TemporalUnit"]))} (^java.lang.Object [this50481 G__50482] (.plus ^java.time.Year this50481 G__50482)) (^java.lang.Object [this50483 G__50484 G__50485] (.plus ^java.time.Year this50483 G__50484 G__50485)))
(clojure.core/defn is-valid-month-day {:arglists (quote (["java.time.Year" "java.time.MonthDay"]))} (^java.lang.Boolean [^java.time.Year this50486 ^java.time.MonthDay java-time-MonthDay50487] (.isValidMonthDay this50486 java-time-MonthDay50487)))
(clojure.core/defn query {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.Year this50488 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery50489] (.query this50488 java-time-temporal-TemporalQuery50489)))
^{:line 77, :column 16} (clojure.core/defn is-leap {:arglists ^{:line 77, :column 54} (quote ^{:line 77, :column 61} (["long"]))} ^{:line 78, :column 18} (^java.lang.Boolean [^long long57050] ^{:line 78, :column 56} (. java.time.Year isLeap long57050)))
(clojure.core/defn to-string {:arglists (quote (["java.time.Year"]))} (^java.lang.String [^java.time.Year this50490] (.toString this50490)))
(clojure.core/defn is-before {:arglists (quote (["java.time.Year" "java.time.Year"]))} (^java.lang.Boolean [^java.time.Year this50491 ^java.time.Year java-time-Year50492] (.isBefore this50491 java-time-Year50492)))
(clojure.core/defn minus {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalAmount"] ["java.time.Year" "java.time.temporal.TemporalAmount"] ["java.time.Year" "long" "java.time.temporal.TemporalUnit"] ["java.time.Year" "long" "java.time.temporal.TemporalUnit"]))} (^java.lang.Object [this50493 G__50494] (.minus ^java.time.Year this50493 G__50494)) (^java.lang.Object [this50495 G__50496 G__50497] (.minus ^java.time.Year this50495 G__50496 G__50497)))
(clojure.core/defn at-month-day {:arglists (quote (["java.time.Year" "java.time.MonthDay"]))} (^java.time.LocalDate [^java.time.Year this50498 ^java.time.MonthDay java-time-MonthDay50499] (.atMonthDay this50498 java-time-MonthDay50499)))
(clojure.core/defn get-value {:arglists (quote (["java.time.Year"]))} (^java.lang.Integer [^java.time.Year this50500] (.value this50500)))
(clojure.core/defn get-long {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalField"]))} (^long [^java.time.Year this50501 ^java.time.temporal.TemporalField java-time-temporal-TemporalField50502] (.getLong this50501 java-time-temporal-TemporalField50502)))
(clojure.core/defn at-month {:arglists (quote (["java.time.Year" "int"] ["java.time.Year" "java.time.Month"]))} (^java.time.YearMonth [this50503 G__50504] (.atMonth ^java.time.Year this50503 G__50504)))
(clojure.core/defn until {:arglists (quote (["java.time.Year" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))} (^long [^java.time.Year this50505 ^java.time.temporal.Temporal java-time-temporal-Temporal50506 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit50507] (.until this50505 java-time-temporal-Temporal50506 java-time-temporal-TemporalUnit50507)))
(clojure.core/defn length {:arglists (quote (["java.time.Year"]))} (^java.lang.Integer [^java.time.Year this50508] (.length this50508)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.Year [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor50509] (. java.time.Year from java-time-temporal-TemporalAccessor50509)))
(clojure.core/defn is-after {:arglists (quote (["java.time.Year" "java.time.Year"]))} (^java.lang.Boolean [^java.time.Year this50510 ^java.time.Year java-time-Year50511] (.isAfter this50510 java-time-Year50511)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalField"] ["java.time.Year" "java.time.temporal.TemporalUnit"]))} (^java.lang.Boolean [this50512 G__50513] (.isSupported ^java.time.Year this50512 G__50513)))
(clojure.core/defn minus-years {:arglists (quote (["java.time.Year" "long"]))} (^java.time.Year [^java.time.Year this50514 ^long long50515] (.minusYears this50514 long50515)))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence" "java.time.format.DateTimeFormatter"] ["java.lang.CharSequence"]))} (^java.time.Year [^java.lang.CharSequence java-lang-CharSequence50516 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter50517] (. java.time.Year parse java-lang-CharSequence50516 java-time-format-DateTimeFormatter50517)) (^java.time.Year [^java.lang.CharSequence java-lang-CharSequence50518] (. java.time.Year parse java-lang-CharSequence50518)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.Year"]))} (^java.lang.Integer [^java.time.Year this50519] (.hashCode this50519)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.Year" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.Year this50520 ^java.time.temporal.Temporal java-time-temporal-Temporal50521] (.adjustInto this50520 java-time-temporal-Temporal50521)))
(clojure.core/defn with {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalField" "long"] ["java.time.Year" "java.time.temporal.TemporalAdjuster"] ["java.time.Year" "java.time.temporal.TemporalAdjuster"] ["java.time.Year" "java.time.temporal.TemporalField" "long"]))} (^java.lang.Object [this50522 G__50523 G__50524] (.with ^java.time.Year this50522 G__50523 G__50524)) (^java.lang.Object [this50525 G__50526] (.with ^java.time.Year this50525 G__50526)))
(clojure.core/defn now {:arglists (quote ([] ["java.time.ZoneId"] ["java.time.Clock"]))} (^java.time.Year [] (. java.time.Year now)) (^java.time.Year [G__50528] (. java.time.Year now G__50528)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.Year" "java.time.Year"] ["java.time.Year" "java.lang.Object"]))} (^java.lang.Integer [this50529 G__50530] (.compareTo ^java.time.Year this50529 G__50530)))
(clojure.core/defn get {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.Year this50531 ^java.time.temporal.TemporalField java-time-temporal-TemporalField50532] (.get this50531 java-time-temporal-TemporalField50532)))
(clojure.core/defn equals {:arglists (quote (["java.time.Year" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.Year this50533 ^java.lang.Object java-lang-Object50534] (.equals this50533 java-lang-Object50534)))
(clojure.core/defn format {:arglists (quote (["java.time.Year" "java.time.format.DateTimeFormatter"]))} (^java.lang.String [^java.time.Year this50535 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter50536] (.format this50535 java-time-format-DateTimeFormatter50536)))
(clojure.core/defn plus-years {:arglists (quote (["java.time.Year" "long"]))} (^java.time.Year [^java.time.Year this50537 ^long long50538] (.plusYears this50537 long50538)))