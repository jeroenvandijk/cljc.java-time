(ns cljc.java-time.day-of-week (:import [java.time DayOfWeek]) (:refer-clojure :exclude [get range format min max next name resolve short]))
(def saturday java.time.DayOfWeek/SATURDAY)
(def thursday java.time.DayOfWeek/THURSDAY)
(def friday java.time.DayOfWeek/FRIDAY)
(def wednesday java.time.DayOfWeek/WEDNESDAY)
(def sunday java.time.DayOfWeek/SUNDAY)
(def monday java.time.DayOfWeek/MONDAY)
(def tuesday java.time.DayOfWeek/TUESDAY)
(clojure.core/defn range {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.DayOfWeek this49821 ^java.time.temporal.TemporalField java-time-temporal-TemporalField49822] (.range this49821 java-time-temporal-TemporalField49822)))
(clojure.core/defn values {:arglists (quote ([]))} (^"java.lang.Class" [] (. java.time.DayOfWeek values)))
(clojure.core/defn value-of {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))} (^java.time.DayOfWeek [^java.lang.String java-lang-String49823] (. java.time.DayOfWeek valueOf java-lang-String49823)) (^java.lang.Enum [^java.lang.Class java-lang-Class49824 ^java.lang.String java-lang-String49825] (. java.time.DayOfWeek valueOf java-lang-Class49824 java-lang-String49825)))
(clojure.core/defn of {:arglists (quote (["int"]))} (^java.time.DayOfWeek [^java.lang.Integer int49826] (. java.time.DayOfWeek of int49826)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.DayOfWeek"]))} (^java.lang.Integer [^java.time.DayOfWeek this49827] (.ordinal this49827)))
(clojure.core/defn plus {:arglists (quote (["java.time.DayOfWeek" "long"]))} (^java.time.DayOfWeek [^java.time.DayOfWeek this49828 ^long long49829] (.plus this49828 long49829)))
(clojure.core/defn query {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.DayOfWeek this49830 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery49831] (.query this49830 java-time-temporal-TemporalQuery49831)))
(clojure.core/defn to-string {:arglists (quote (["java.time.DayOfWeek"]))} (^java.lang.String [^java.time.DayOfWeek this49832] (.toString this49832)))
(clojure.core/defn minus {:arglists (quote (["java.time.DayOfWeek" "long"]))} (^java.time.DayOfWeek [^java.time.DayOfWeek this49833 ^long long49834] (.minus this49833 long49834)))
(clojure.core/defn get-display-name {:arglists (quote (["java.time.DayOfWeek" "java.time.format.TextStyle" "java.util.Locale"]))} (^java.lang.String [^java.time.DayOfWeek this49835 ^java.time.format.TextStyle java-time-format-TextStyle49836 ^java.util.Locale java-util-Locale49837] (.getDisplayName this49835 java-time-format-TextStyle49836 java-util-Locale49837)))
(clojure.core/defn get-value {:arglists (quote (["java.time.DayOfWeek"]))} (^java.lang.Integer [^java.time.DayOfWeek this49838] (.getValue this49838)))
(clojure.core/defn name {:arglists (quote (["java.time.DayOfWeek"]))} (^java.lang.String [^java.time.DayOfWeek this49839] (.name this49839)))
(clojure.core/defn get-long {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalField"]))} (^long [^java.time.DayOfWeek this49840 ^java.time.temporal.TemporalField java-time-temporal-TemporalField49841] (.getLong this49840 java-time-temporal-TemporalField49841)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.DayOfWeek"]))} (^java.lang.Class [^java.time.DayOfWeek this49842] (.getDeclaringClass this49842)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.DayOfWeek [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor49843] (. java.time.DayOfWeek from java-time-temporal-TemporalAccessor49843)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [^java.time.DayOfWeek this49844 ^java.time.temporal.TemporalField java-time-temporal-TemporalField49845] (.isSupported this49844 java-time-temporal-TemporalField49845)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.DayOfWeek"]))} (^java.lang.Integer [^java.time.DayOfWeek this49846] (.hashCode this49846)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.DayOfWeek this49847 ^java.time.temporal.Temporal java-time-temporal-Temporal49848] (.adjustInto this49847 java-time-temporal-Temporal49848)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.DayOfWeek" "java.lang.Object"] ["java.time.DayOfWeek" "java.lang.Enum"]))} (^java.lang.Integer [this49849 G__49850] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__49850)) (clojure.core/let [G__49850 ^"java.lang.Object" G__49850] (.compareTo ^java.time.DayOfWeek this49849 G__49850)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Enum") G__49850)) (clojure.core/let [G__49850 ^"java.lang.Enum" G__49850] (.compareTo ^java.time.DayOfWeek this49849 G__49850)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn get {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.DayOfWeek this49851 ^java.time.temporal.TemporalField java-time-temporal-TemporalField49852] (.get this49851 java-time-temporal-TemporalField49852)))
(clojure.core/defn equals {:arglists (quote (["java.time.DayOfWeek" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.DayOfWeek this49853 ^java.lang.Object java-lang-Object49854] (.equals this49853 java-lang-Object49854)))