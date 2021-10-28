(ns cljc.java-time.offset-date-time (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness] [goog.object] [java.time :refer [OffsetDateTime]]))
(def min (goog.object/get java.time.OffsetDateTime "MIN"))
(def max (goog.object/get java.time.OffsetDateTime "MAX"))
(clojure.core/defn minus-minutes {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this13952 ^long long13953] (.minusMinutes this13952 long13953)))
(clojure.core/defn truncated-to {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalUnit"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this13954 ^js/JSJoda.TemporalUnit java-time-temporal-TemporalUnit13955] (.truncatedTo this13954 java-time-temporal-TemporalUnit13955)))
(clojure.core/defn minus-weeks {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this13956 ^long long13957] (.minusWeeks this13956 long13957)))
(clojure.core/defn to-instant {:arglists (quote (["java.time.OffsetDateTime"]))} (^js/JSJoda.Instant [^js/JSJoda.OffsetDateTime this13958] (.toInstant this13958)))
(clojure.core/defn plus-weeks {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this13959 ^long long13960] (.plusWeeks this13959 long13960)))
(clojure.core/defn range {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalField"]))} (^js/JSJoda.ValueRange [^js/JSJoda.OffsetDateTime this13961 ^js/JSJoda.TemporalField java-time-temporal-TemporalField13962] (.range this13961 java-time-temporal-TemporalField13962)))
(clojure.core/defn get-hour {:arglists (quote (["java.time.OffsetDateTime"]))} (^int [^js/JSJoda.OffsetDateTime this13963] (.hour this13963)))
(clojure.core/defn at-zone-same-instant {:arglists (quote (["java.time.OffsetDateTime" "java.time.ZoneId"]))} (^js/JSJoda.ZonedDateTime [^js/JSJoda.OffsetDateTime this13964 ^js/JSJoda.ZoneId java-time-ZoneId13965] (.atZoneSameInstant this13964 java-time-ZoneId13965)))
(clojure.core/defn minus-hours {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this13966 ^long long13967] (.minusHours this13966 long13967)))
(clojure.core/defn of {:arglists (quote (["int" "int" "int" "int" "int" "int" "int" "java.time.ZoneOffset"] ["java.time.LocalDateTime" "java.time.ZoneOffset"] ["java.time.LocalDate" "java.time.LocalTime" "java.time.ZoneOffset"]))} (^js/JSJoda.OffsetDateTime [^int int13968 ^int int13969 ^int int13970 ^int int13971 ^int int13972 ^int int13973 ^int int13974 ^js/JSJoda.ZoneOffset java-time-ZoneOffset13975] (js-invoke java.time.OffsetDateTime "of" int13968 int13969 int13970 int13971 int13972 int13973 int13974 java-time-ZoneOffset13975)) (^js/JSJoda.OffsetDateTime [^js/JSJoda.LocalDateTime java-time-LocalDateTime13976 ^js/JSJoda.ZoneOffset java-time-ZoneOffset13977] (js-invoke java.time.OffsetDateTime "of" java-time-LocalDateTime13976 java-time-ZoneOffset13977)) (^js/JSJoda.OffsetDateTime [^js/JSJoda.LocalDate java-time-LocalDate13978 ^js/JSJoda.LocalTime java-time-LocalTime13979 ^js/JSJoda.ZoneOffset java-time-ZoneOffset13980] (js-invoke java.time.OffsetDateTime "of" java-time-LocalDate13978 java-time-LocalTime13979 java-time-ZoneOffset13980)))
(clojure.core/defn with-month {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this13981 ^int int13982] (.withMonth this13981 int13982)))
(clojure.core/defn is-equal {:arglists (quote (["java.time.OffsetDateTime" "java.time.OffsetDateTime"]))} (^boolean [^js/JSJoda.OffsetDateTime this13983 ^js/JSJoda.OffsetDateTime java-time-OffsetDateTime13984] (.isEqual this13983 java-time-OffsetDateTime13984)))
(clojure.core/defn get-nano {:arglists (quote (["java.time.OffsetDateTime"]))} (^int [^js/JSJoda.OffsetDateTime this13985] (.nano this13985)))
(clojure.core/defn to-offset-time {:arglists (quote (["java.time.OffsetDateTime"]))} (^js/JSJoda.OffsetTime [^js/JSJoda.OffsetDateTime this13986] (.toOffsetTime this13986)))
(clojure.core/defn at-zone-similar-local {:arglists (quote (["java.time.OffsetDateTime" "java.time.ZoneId"]))} (^js/JSJoda.ZonedDateTime [^js/JSJoda.OffsetDateTime this13987 ^js/JSJoda.ZoneId java-time-ZoneId13988] (.atZoneSimilarLocal this13987 java-time-ZoneId13988)))
(clojure.core/defn get-year {:arglists (quote (["java.time.OffsetDateTime"]))} (^int [^js/JSJoda.OffsetDateTime this13989] (.year this13989)))
(clojure.core/defn minus-seconds {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this13990 ^long long13991] (.minusSeconds this13990 long13991)))
(clojure.core/defn get-second {:arglists (quote (["java.time.OffsetDateTime"]))} (^int [^js/JSJoda.OffsetDateTime this13992] (.second this13992)))
(clojure.core/defn plus-nanos {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this13993 ^long long13994] (.plusNanos this13993 long13994)))
(clojure.core/defn get-day-of-year {:arglists (quote (["java.time.OffsetDateTime"]))} (^int [^js/JSJoda.OffsetDateTime this13995] (.dayOfYear this13995)))
(clojure.core/defn plus {:arglists (quote (["java.time.OffsetDateTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.OffsetDateTime" "java.time.temporal.TemporalAmount"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this13996 ^long long13997 ^js/JSJoda.TemporalUnit java-time-temporal-TemporalUnit13998] (.plus this13996 long13997 java-time-temporal-TemporalUnit13998)) (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this13999 ^js/JSJoda.TemporalAmount java-time-temporal-TemporalAmount14000] (.plus this13999 java-time-temporal-TemporalAmount14000)))
(clojure.core/defn time-line-order {:arglists (quote ([]))} (^java.util.Comparator [] (js-invoke java.time.OffsetDateTime "timeLineOrder")))
(clojure.core/defn with-hour {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this14001 ^int int14002] (.withHour this14001 int14002)))
(clojure.core/defn with-minute {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this14003 ^int int14004] (.withMinute this14003 int14004)))
(clojure.core/defn plus-minutes {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this14005 ^long long14006] (.plusMinutes this14005 long14006)))
(clojure.core/defn query {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^js/JSJoda.OffsetDateTime this14007 ^js/JSJoda.TemporalQuery java-time-temporal-TemporalQuery14008] (.query this14007 java-time-temporal-TemporalQuery14008)))
(clojure.core/defn with-offset-same-instant {:arglists (quote (["java.time.OffsetDateTime" "java.time.ZoneOffset"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this14009 ^js/JSJoda.ZoneOffset java-time-ZoneOffset14010] (.withOffsetSameInstant this14009 java-time-ZoneOffset14010)))
(clojure.core/defn get-day-of-week {:arglists (quote (["java.time.OffsetDateTime"]))} (^js/JSJoda.DayOfWeek [^js/JSJoda.OffsetDateTime this14011] (.dayOfWeek this14011)))
(clojure.core/defn to-string {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.String [^js/JSJoda.OffsetDateTime this14012] (.toString this14012)))
(clojure.core/defn plus-months {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this14013 ^long long14014] (.plusMonths this14013 long14014)))
(clojure.core/defn is-before {:arglists (quote (["java.time.OffsetDateTime" "java.time.OffsetDateTime"]))} (^boolean [^js/JSJoda.OffsetDateTime this14015 ^js/JSJoda.OffsetDateTime java-time-OffsetDateTime14016] (.isBefore this14015 java-time-OffsetDateTime14016)))
(clojure.core/defn minus-months {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this14017 ^long long14018] (.minusMonths this14017 long14018)))
(clojure.core/defn minus {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalAmount"] ["java.time.OffsetDateTime" "long" "java.time.temporal.TemporalUnit"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this14019 ^js/JSJoda.TemporalAmount java-time-temporal-TemporalAmount14020] (.minus this14019 java-time-temporal-TemporalAmount14020)) (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this14021 ^long long14022 ^js/JSJoda.TemporalUnit java-time-temporal-TemporalUnit14023] (.minus this14021 long14022 java-time-temporal-TemporalUnit14023)))
(clojure.core/defn plus-hours {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this14024 ^long long14025] (.plusHours this14024 long14025)))
(clojure.core/defn plus-days {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this14026 ^long long14027] (.plusDays this14026 long14027)))
(clojure.core/defn to-local-time {:arglists (quote (["java.time.OffsetDateTime"]))} (^js/JSJoda.LocalTime [^js/JSJoda.OffsetDateTime this14028] (.toLocalTime this14028)))
(clojure.core/defn get-long {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalField"]))} (^long [^js/JSJoda.OffsetDateTime this14029 ^js/JSJoda.TemporalField java-time-temporal-TemporalField14030] (.getLong this14029 java-time-temporal-TemporalField14030)))
(clojure.core/defn get-offset {:arglists (quote (["java.time.OffsetDateTime"]))} (^js/JSJoda.ZoneOffset [^js/JSJoda.OffsetDateTime this14031] (.offset this14031)))
(clojure.core/defn to-zoned-date-time {:arglists (quote (["java.time.OffsetDateTime"]))} (^js/JSJoda.ZonedDateTime [^js/JSJoda.OffsetDateTime this14032] (.toZonedDateTime this14032)))
(clojure.core/defn with-year {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this14033 ^int int14034] (.withYear this14033 int14034)))
(clojure.core/defn with-nano {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this14035 ^int int14036] (.withNano this14035 int14036)))
(clojure.core/defn to-epoch-second {:arglists (quote (["java.time.OffsetDateTime"]))} (^long [^js/JSJoda.OffsetDateTime this14037] (.toEpochSecond this14037)))
(clojure.core/defn until {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))} (^long [^js/JSJoda.OffsetDateTime this14038 ^js/JSJoda.Temporal java-time-temporal-Temporal14039 ^js/JSJoda.TemporalUnit java-time-temporal-TemporalUnit14040] (.until this14038 java-time-temporal-Temporal14039 java-time-temporal-TemporalUnit14040)))
(clojure.core/defn with-offset-same-local {:arglists (quote (["java.time.OffsetDateTime" "java.time.ZoneOffset"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this14041 ^js/JSJoda.ZoneOffset java-time-ZoneOffset14042] (.withOffsetSameLocal this14041 java-time-ZoneOffset14042)))
(clojure.core/defn with-day-of-month {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this14043 ^int int14044] (.withDayOfMonth this14043 int14044)))
(clojure.core/defn get-day-of-month {:arglists (quote (["java.time.OffsetDateTime"]))} (^int [^js/JSJoda.OffsetDateTime this14045] (.dayOfMonth this14045)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.TemporalAccessor java-time-temporal-TemporalAccessor14046] (js-invoke java.time.OffsetDateTime "from" java-time-temporal-TemporalAccessor14046)))
(clojure.core/defn is-after {:arglists (quote (["java.time.OffsetDateTime" "java.time.OffsetDateTime"]))} (^boolean [^js/JSJoda.OffsetDateTime this14047 ^js/JSJoda.OffsetDateTime java-time-OffsetDateTime14048] (.isAfter this14047 java-time-OffsetDateTime14048)))
(clojure.core/defn minus-nanos {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this14049 ^long long14050] (.minusNanos this14049 long14050)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalField"] ["java.time.OffsetDateTime" "java.time.temporal.TemporalUnit"]))} (^boolean [this14051 G__14052] (.isSupported ^js/JSJoda.OffsetDateTime this14051 G__14052)))
(clojure.core/defn minus-years {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this14053 ^long long14054] (.minusYears this14053 long14054)))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))} (^js/JSJoda.OffsetDateTime [^java.lang.CharSequence java-lang-CharSequence14055] (js-invoke java.time.OffsetDateTime "parse" java-lang-CharSequence14055)) (^js/JSJoda.OffsetDateTime [^java.lang.CharSequence java-lang-CharSequence14056 ^js/JSJoda.DateTimeFormatter java-time-format-DateTimeFormatter14057] (js-invoke java.time.OffsetDateTime "parse" java-lang-CharSequence14056 java-time-format-DateTimeFormatter14057)))
(clojure.core/defn with-second {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this14058 ^int int14059] (.withSecond this14058 int14059)))
(clojure.core/defn to-local-date {:arglists (quote (["java.time.OffsetDateTime"]))} (^js/JSJoda.LocalDate [^js/JSJoda.OffsetDateTime this14060] (.toLocalDate this14060)))
(clojure.core/defn get-minute {:arglists (quote (["java.time.OffsetDateTime"]))} (^int [^js/JSJoda.OffsetDateTime this14061] (.minute this14061)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.OffsetDateTime"]))} (^int [^js/JSJoda.OffsetDateTime this14062] (.hashCode this14062)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.Temporal"]))} (^js/JSJoda.Temporal [^js/JSJoda.OffsetDateTime this14063 ^js/JSJoda.Temporal java-time-temporal-Temporal14064] (.adjustInto this14063 java-time-temporal-Temporal14064)))
(clojure.core/defn with {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalAdjuster"] ["java.time.OffsetDateTime" "java.time.temporal.TemporalField" "long"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this14065 ^js/JSJoda.TemporalAdjuster java-time-temporal-TemporalAdjuster14066] (.with this14065 java-time-temporal-TemporalAdjuster14066)) (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this14067 ^js/JSJoda.TemporalField java-time-temporal-TemporalField14068 ^long long14069] (.with this14067 java-time-temporal-TemporalField14068 long14069)))
(clojure.core/defn now {:arglists (quote (["java.time.Clock"] [] ["java.time.ZoneId"]))} (^js/JSJoda.OffsetDateTime [G__14071] (js-invoke java.time.OffsetDateTime "now" G__14071)) (^js/JSJoda.OffsetDateTime [] (js-invoke java.time.OffsetDateTime "now")))
(clojure.core/defn to-local-date-time {:arglists (quote (["java.time.OffsetDateTime"]))} (^js/JSJoda.LocalDateTime [^js/JSJoda.OffsetDateTime this14072] (.toLocalDateTime this14072)))
(clojure.core/defn get-month-value {:arglists (quote (["java.time.OffsetDateTime"]))} (^int [^js/JSJoda.OffsetDateTime this14073] (.monthValue this14073)))
(clojure.core/defn with-day-of-year {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this14074 ^int int14075] (.withDayOfYear this14074 int14075)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.OffsetDateTime" "java.time.OffsetDateTime"]))} (^int [^js/JSJoda.OffsetDateTime this14076 ^js/JSJoda.OffsetDateTime java-time-OffsetDateTime14077] (.compareTo this14076 java-time-OffsetDateTime14077)))
(clojure.core/defn get-month {:arglists (quote (["java.time.OffsetDateTime"]))} (^js/JSJoda.Month [^js/JSJoda.OffsetDateTime this14078] (.month this14078)))
(clojure.core/defn of-instant {:arglists (quote (["java.time.Instant" "java.time.ZoneId"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.Instant java-time-Instant14079 ^js/JSJoda.ZoneId java-time-ZoneId14080] (js-invoke java.time.OffsetDateTime "ofInstant" java-time-Instant14079 java-time-ZoneId14080)))
(clojure.core/defn plus-seconds {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this14081 ^long long14082] (.plusSeconds this14081 long14082)))
(clojure.core/defn get {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalField"]))} (^int [^js/JSJoda.OffsetDateTime this14083 ^js/JSJoda.TemporalField java-time-temporal-TemporalField14084] (.get this14083 java-time-temporal-TemporalField14084)))
(clojure.core/defn equals {:arglists (quote (["java.time.OffsetDateTime" "java.lang.Object"]))} (^boolean [^js/JSJoda.OffsetDateTime this14085 ^java.lang.Object java-lang-Object14086] (.equals this14085 java-lang-Object14086)))
(clojure.core/defn format {:arglists (quote (["java.time.OffsetDateTime" "java.time.format.DateTimeFormatter"]))} (^java.lang.String [^js/JSJoda.OffsetDateTime this14087 ^js/JSJoda.DateTimeFormatter java-time-format-DateTimeFormatter14088] (.format this14087 java-time-format-DateTimeFormatter14088)))
(clojure.core/defn plus-years {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this14089 ^long long14090] (.plusYears this14089 long14090)))
(clojure.core/defn minus-days {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.OffsetDateTime this14091 ^long long14092] (.minusDays this14091 long14092)))
