(ns cljc.java-time.day-of-week (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness]) (:import [java.time DayOfWeek]))
(def saturday java.time.DayOfWeek/SATURDAY)
(def thursday java.time.DayOfWeek/THURSDAY)
(def friday java.time.DayOfWeek/FRIDAY)
(def wednesday java.time.DayOfWeek/WEDNESDAY)
(def sunday java.time.DayOfWeek/SUNDAY)
(def monday java.time.DayOfWeek/MONDAY)
(def tuesday java.time.DayOfWeek/TUESDAY)
(clojure.core/defn range {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.DayOfWeek this11829 ^java.time.temporal.TemporalField java-time-temporal-TemporalField11830] (.range this11829 java-time-temporal-TemporalField11830)))
(clojure.core/defn values {:arglists (quote ([]))} (^"java.lang.Class" [] (. java.time.DayOfWeek values)))
(clojure.core/defn value-of {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))} (^java.time.DayOfWeek [^java.lang.String java-lang-String11831] (. java.time.DayOfWeek valueOf java-lang-String11831)) (^java.lang.Enum [^java.lang.Class java-lang-Class11832 ^java.lang.String java-lang-String11833] (. java.time.DayOfWeek valueOf java-lang-Class11832 java-lang-String11833)))
(clojure.core/defn of {:arglists (quote (["int"]))} (^java.time.DayOfWeek [^java.lang.Integer int11834] (. java.time.DayOfWeek of int11834)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.DayOfWeek"]))} (^java.lang.Integer [^java.time.DayOfWeek this11835] (.ordinal this11835)))
(clojure.core/defn plus {:arglists (quote (["java.time.DayOfWeek" "long"]))} (^java.time.DayOfWeek [^java.time.DayOfWeek this11836 ^long long11837] (.plus this11836 long11837)))
(clojure.core/defn query {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.DayOfWeek this11838 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery11839] (.query this11838 java-time-temporal-TemporalQuery11839)))
(clojure.core/defn to-string {:arglists (quote (["java.time.DayOfWeek"]))} (^java.lang.String [^java.time.DayOfWeek this11840] (.toString this11840)))
(clojure.core/defn minus {:arglists (quote (["java.time.DayOfWeek" "long"]))} (^java.time.DayOfWeek [^java.time.DayOfWeek this11841 ^long long11842] (.minus this11841 long11842)))
(clojure.core/defn get-display-name {:arglists (quote (["java.time.DayOfWeek" "java.time.format.TextStyle" "java.util.Locale"]))} (^java.lang.String [^java.time.DayOfWeek this11843 ^java.time.format.TextStyle java-time-format-TextStyle11844 ^java.util.Locale java-util-Locale11845] (.getDisplayName this11843 java-time-format-TextStyle11844 java-util-Locale11845)))
(clojure.core/defn get-value {:arglists (quote (["java.time.DayOfWeek"]))} (^java.lang.Integer [^java.time.DayOfWeek this11846] (.getValue this11846)))
(clojure.core/defn name {:arglists (quote (["java.time.DayOfWeek"]))} (^java.lang.String [^java.time.DayOfWeek this11847] (.name this11847)))
(clojure.core/defn get-long {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalField"]))} (^long [^java.time.DayOfWeek this11848 ^java.time.temporal.TemporalField java-time-temporal-TemporalField11849] (.getLong this11848 java-time-temporal-TemporalField11849)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.DayOfWeek"]))} (^java.lang.Class [^java.time.DayOfWeek this11850] (.getDeclaringClass this11850)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.DayOfWeek [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor11851] (. java.time.DayOfWeek from java-time-temporal-TemporalAccessor11851)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [^java.time.DayOfWeek this11852 ^java.time.temporal.TemporalField java-time-temporal-TemporalField11853] (.isSupported this11852 java-time-temporal-TemporalField11853)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.DayOfWeek"]))} (^java.lang.Integer [^java.time.DayOfWeek this11854] (.hashCode this11854)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.DayOfWeek this11855 ^java.time.temporal.Temporal java-time-temporal-Temporal11856] (.adjustInto this11855 java-time-temporal-Temporal11856)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.DayOfWeek" "java.lang.Object"] ["java.time.DayOfWeek" "java.lang.Enum"]))} (^java.lang.Integer [this11857 G__11858] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__11858)) (clojure.core/let [G__11858 ^"java.lang.Object" G__11858] (.compareTo ^java.time.DayOfWeek this11857 G__11858)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Enum") G__11858)) (clojure.core/let [G__11858 ^"java.lang.Enum" G__11858] (.compareTo ^java.time.DayOfWeek this11857 G__11858)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn get {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.DayOfWeek this11859 ^java.time.temporal.TemporalField java-time-temporal-TemporalField11860] (.get this11859 java-time-temporal-TemporalField11860)))
(clojure.core/defn equals {:arglists (quote (["java.time.DayOfWeek" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.DayOfWeek this11861 ^java.lang.Object java-lang-Object11862] (.equals this11861 java-lang-Object11862)))
