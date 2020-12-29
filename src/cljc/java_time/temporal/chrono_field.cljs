(ns cljc.java-time.temporal.chrono-field (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness] [java.time.temporal :refer [ChronoField]]))
(def milli-of-second (. java.time.temporal.ChronoField -MILLI_OF_SECOND))
(def year-of-era (. java.time.temporal.ChronoField -YEAR_OF_ERA))
(def clock-hour-of-day (. java.time.temporal.ChronoField -CLOCK_HOUR_OF_DAY))
(def era (. java.time.temporal.ChronoField -ERA))
(def instant-seconds (. java.time.temporal.ChronoField -INSTANT_SECONDS))
(def ampm-of-day (. java.time.temporal.ChronoField -AMPM_OF_DAY))
(def offset-seconds (. java.time.temporal.ChronoField -OFFSET_SECONDS))
(def nano-of-second (. java.time.temporal.ChronoField -NANO_OF_SECOND))
(def nano-of-day (. java.time.temporal.ChronoField -NANO_OF_DAY))
(def aligned-day-of-week-in-month (. java.time.temporal.ChronoField -ALIGNED_DAY_OF_WEEK_IN_MONTH))
(def month-of-year (. java.time.temporal.ChronoField -MONTH_OF_YEAR))
(def hour-of-ampm (. java.time.temporal.ChronoField -HOUR_OF_AMPM))
(def year (. java.time.temporal.ChronoField -YEAR))
(def micro-of-second (. java.time.temporal.ChronoField -MICRO_OF_SECOND))
(def aligned-week-of-year (. java.time.temporal.ChronoField -ALIGNED_WEEK_OF_YEAR))
(def proleptic-month (. java.time.temporal.ChronoField -PROLEPTIC_MONTH))
(def day-of-month (. java.time.temporal.ChronoField -DAY_OF_MONTH))
(def second-of-minute (. java.time.temporal.ChronoField -SECOND_OF_MINUTE))
(def second-of-day (. java.time.temporal.ChronoField -SECOND_OF_DAY))
(def epoch-day (. java.time.temporal.ChronoField -EPOCH_DAY))
(def day-of-year (. java.time.temporal.ChronoField -DAY_OF_YEAR))
(def aligned-week-of-month (. java.time.temporal.ChronoField -ALIGNED_WEEK_OF_MONTH))
(def day-of-week (. java.time.temporal.ChronoField -DAY_OF_WEEK))
(def clock-hour-of-ampm (. java.time.temporal.ChronoField -CLOCK_HOUR_OF_AMPM))
(def minute-of-day (. java.time.temporal.ChronoField -MINUTE_OF_DAY))
(def aligned-day-of-week-in-year (. java.time.temporal.ChronoField -ALIGNED_DAY_OF_WEEK_IN_YEAR))
(def minute-of-hour (. java.time.temporal.ChronoField -MINUTE_OF_HOUR))
(def hour-of-day (. java.time.temporal.ChronoField -HOUR_OF_DAY))
(def milli-of-day (. java.time.temporal.ChronoField -MILLI_OF_DAY))
(def micro-of-day (. java.time.temporal.ChronoField -MICRO_OF_DAY))
(clojure.core/defn get-range-unit {:arglists (quote (["java.time.temporal.ChronoField"]))} (^java.time.temporal.TemporalUnit [^java.time.temporal.ChronoField this12981] (.rangeUnit this12981)))
(clojure.core/defn range {:arglists (quote (["java.time.temporal.ChronoField"]))} (^java.time.temporal.ValueRange [^java.time.temporal.ChronoField this12982] (.range this12982)))
(clojure.core/defn values {:arglists (quote ([]))} (^"java.lang.Class" [] (. java.time.temporal.ChronoField values)))
(clojure.core/defn value-of {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))} (^java.time.temporal.ChronoField [^java.lang.String java-lang-String12983] (. java.time.temporal.ChronoField valueOf java-lang-String12983)) (^java.lang.Enum [^java.lang.Class java-lang-Class12984 ^java.lang.String java-lang-String12985] (. java.time.temporal.ChronoField valueOf java-lang-Class12984 java-lang-String12985)))
(clojure.core/defn resolve {:arglists (quote (["java.time.temporal.ChronoField" "java.util.Map" "java.time.temporal.TemporalAccessor" "java.time.format.ResolverStyle"]))} (^java.time.temporal.TemporalAccessor [^java.time.temporal.ChronoField this12986 ^java.util.Map java-util-Map12987 ^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor12988 ^java.time.format.ResolverStyle java-time-format-ResolverStyle12989] (.resolve this12986 java-util-Map12987 java-time-temporal-TemporalAccessor12988 java-time-format-ResolverStyle12989)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.temporal.ChronoField"]))} (^java.lang.Integer [^java.time.temporal.ChronoField this12990] (.ordinal this12990)))
(clojure.core/defn check-valid-int-value {:arglists (quote (["java.time.temporal.ChronoField" "long"]))} (^java.lang.Integer [^java.time.temporal.ChronoField this12991 ^long long12992] (.checkValidIntValue this12991 long12992)))
(clojure.core/defn get-base-unit {:arglists (quote (["java.time.temporal.ChronoField"]))} (^java.time.temporal.TemporalUnit [^java.time.temporal.ChronoField this12993] (.baseUnit this12993)))
(clojure.core/defn to-string {:arglists (quote (["java.time.temporal.ChronoField"]))} (^java.lang.String [^java.time.temporal.ChronoField this12994] (.toString this12994)))
(clojure.core/defn is-date-based {:arglists (quote (["java.time.temporal.ChronoField"]))} (^java.lang.Boolean [^java.time.temporal.ChronoField this12995] (.isDateBased this12995)))
(clojure.core/defn get-display-name {:arglists (quote (["java.time.temporal.ChronoField" "java.util.Locale"]))} (^java.lang.String [^java.time.temporal.ChronoField this12996 ^java.util.Locale java-util-Locale12997] (.displayName this12996 java-util-Locale12997)))
(clojure.core/defn name {:arglists (quote (["java.time.temporal.ChronoField"]))} (^java.lang.String [^java.time.temporal.ChronoField this12998] (.name this12998)))
(clojure.core/defn is-supported-by {:arglists (quote (["java.time.temporal.ChronoField" "java.time.temporal.TemporalAccessor"]))} (^java.lang.Boolean [^java.time.temporal.ChronoField this12999 ^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor13000] (.isSupportedBy this12999 java-time-temporal-TemporalAccessor13000)))
(clojure.core/defn range-refined-by {:arglists (quote (["java.time.temporal.ChronoField" "java.time.temporal.TemporalAccessor"]))} (^java.time.temporal.ValueRange [^java.time.temporal.ChronoField this13001 ^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor13002] (.rangeRefinedBy this13001 java-time-temporal-TemporalAccessor13002)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.temporal.ChronoField"]))} (^java.lang.Class [^java.time.temporal.ChronoField this13003] (.declaringClass this13003)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.temporal.ChronoField"]))} (^java.lang.Integer [^java.time.temporal.ChronoField this13004] (.hashCode this13004)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.temporal.ChronoField" "java.time.temporal.Temporal" "long"]))} (^java.time.temporal.Temporal [^java.time.temporal.ChronoField this13005 ^java.time.temporal.Temporal java-time-temporal-Temporal13006 ^long long13007] (.adjustInto this13005 java-time-temporal-Temporal13006 long13007)))
(clojure.core/defn get-from {:arglists (quote (["java.time.temporal.ChronoField" "java.time.temporal.TemporalAccessor"]))} (^long [^java.time.temporal.ChronoField this13008 ^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor13009] (.from this13008 java-time-temporal-TemporalAccessor13009)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.temporal.ChronoField" "java.lang.Object"] ["java.time.temporal.ChronoField" "java.lang.Enum"]))} (^java.lang.Integer [this13010 G__13011] (.compareTo ^java.time.temporal.ChronoField this13010 G__13011)))
(clojure.core/defn equals {:arglists (quote (["java.time.temporal.ChronoField" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.temporal.ChronoField this13012 ^java.lang.Object java-lang-Object13013] (.equals this13012 java-lang-Object13013)))
(clojure.core/defn is-time-based {:arglists (quote (["java.time.temporal.ChronoField"]))} (^java.lang.Boolean [^java.time.temporal.ChronoField this13014] (.isTimeBased this13014)))
(clojure.core/defn check-valid-value {:arglists (quote (["java.time.temporal.ChronoField" "long"]))} (^long [^java.time.temporal.ChronoField this13015 ^long long13016] (.checkValidValue this13015 long13016)))
