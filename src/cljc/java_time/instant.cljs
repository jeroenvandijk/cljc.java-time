(ns cljc.java-time.instant (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness] [goog.object] [java.time :refer [Instant]]))
(def min (goog.object/get java.time.Instant "MIN"))
(def epoch (goog.object/get java.time.Instant "EPOCH"))
(def max (goog.object/get java.time.Instant "MAX"))
(clojure.core/defn truncated-to {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalUnit"]))} (^js/JSJoda.Instant [^js/JSJoda.Instant this13743 ^js/JSJoda.TemporalUnit java-time-temporal-TemporalUnit13744] (.truncatedTo this13743 java-time-temporal-TemporalUnit13744)))
(clojure.core/defn range {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalField"]))} (^js/JSJoda.ValueRange [^js/JSJoda.Instant this13745 ^js/JSJoda.TemporalField java-time-temporal-TemporalField13746] (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.range this13745 java-time-temporal-TemporalField13746))))
(clojure.core/defn of-epoch-second {:arglists (quote (["long"] ["long" "long"]))} (^js/JSJoda.Instant [^long long13747] (js-invoke java.time.Instant "ofEpochSecond" long13747)) (^js/JSJoda.Instant [^long long13748 ^long long13749] (js-invoke java.time.Instant "ofEpochSecond" long13748 long13749)))
(clojure.core/defn at-offset {:arglists (quote (["java.time.Instant" "java.time.ZoneOffset"]))} (^js/JSJoda.OffsetDateTime [^js/JSJoda.Instant this13750 ^js/JSJoda.ZoneOffset java-time-ZoneOffset13751] (.atOffset this13750 java-time-ZoneOffset13751)))
(clojure.core/defn minus-millis {:arglists (quote (["java.time.Instant" "long"]))} (^js/JSJoda.Instant [^js/JSJoda.Instant this13752 ^long long13753] (.minusMillis this13752 long13753)))
(clojure.core/defn get-nano {:arglists (quote (["java.time.Instant"]))} (^int [^js/JSJoda.Instant this13754] (.nano this13754)))
(clojure.core/defn plus-millis {:arglists (quote (["java.time.Instant" "long"]))} (^js/JSJoda.Instant [^js/JSJoda.Instant this13755 ^long long13756] (.plusMillis this13755 long13756)))
(clojure.core/defn minus-seconds {:arglists (quote (["java.time.Instant" "long"]))} (^js/JSJoda.Instant [^js/JSJoda.Instant this13757 ^long long13758] (.minusSeconds this13757 long13758)))
(clojure.core/defn plus-nanos {:arglists (quote (["java.time.Instant" "long"]))} (^js/JSJoda.Instant [^js/JSJoda.Instant this13759 ^long long13760] (.plusNanos this13759 long13760)))
(clojure.core/defn plus {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalAmount"] ["java.time.Instant" "long" "java.time.temporal.TemporalUnit"]))} (^js/JSJoda.Instant [^js/JSJoda.Instant this13761 ^js/JSJoda.TemporalAmount java-time-temporal-TemporalAmount13762] (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.plus this13761 java-time-temporal-TemporalAmount13762))) (^js/JSJoda.Instant [^js/JSJoda.Instant this13763 ^long long13764 ^js/JSJoda.TemporalUnit java-time-temporal-TemporalUnit13765] (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.plus this13763 long13764 java-time-temporal-TemporalUnit13765))))
(clojure.core/defn query {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^js/JSJoda.Instant this13766 ^js/JSJoda.TemporalQuery java-time-temporal-TemporalQuery13767] (.query this13766 java-time-temporal-TemporalQuery13767)))
(clojure.core/defn to-string {:arglists (quote (["java.time.Instant"]))} (^java.lang.String [^js/JSJoda.Instant this13768] (.toString this13768)))
(clojure.core/defn is-before {:arglists (quote (["java.time.Instant" "java.time.Instant"]))} (^boolean [^js/JSJoda.Instant this13769 ^js/JSJoda.Instant java-time-Instant13770] (.isBefore this13769 java-time-Instant13770)))
(clojure.core/defn minus {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalAmount"] ["java.time.Instant" "long" "java.time.temporal.TemporalUnit"]))} (^js/JSJoda.Instant [^js/JSJoda.Instant this13771 ^js/JSJoda.TemporalAmount java-time-temporal-TemporalAmount13772] (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.minus this13771 java-time-temporal-TemporalAmount13772))) (^js/JSJoda.Instant [^js/JSJoda.Instant this13773 ^long long13774 ^js/JSJoda.TemporalUnit java-time-temporal-TemporalUnit13775] (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.minus this13773 long13774 java-time-temporal-TemporalUnit13775))))
(clojure.core/defn at-zone {:arglists (quote (["java.time.Instant" "java.time.ZoneId"]))} (^js/JSJoda.ZonedDateTime [^js/JSJoda.Instant this13776 ^js/JSJoda.ZoneId java-time-ZoneId13777] (.atZone this13776 java-time-ZoneId13777)))
(clojure.core/defn of-epoch-milli {:arglists (quote (["long"]))} (^js/JSJoda.Instant [^long long13778] (js-invoke java.time.Instant "ofEpochMilli" long13778)))
(clojure.core/defn get-long {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalField"]))} (^long [^js/JSJoda.Instant this13779 ^js/JSJoda.TemporalField java-time-temporal-TemporalField13780] (.getLong this13779 java-time-temporal-TemporalField13780)))
(clojure.core/defn until {:arglists (quote (["java.time.Instant" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))} (^long [^js/JSJoda.Instant this13781 ^js/JSJoda.Temporal java-time-temporal-Temporal13782 ^js/JSJoda.TemporalUnit java-time-temporal-TemporalUnit13783] (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.until this13781 java-time-temporal-Temporal13782 java-time-temporal-TemporalUnit13783))))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^js/JSJoda.Instant [^js/JSJoda.TemporalAccessor java-time-temporal-TemporalAccessor13784] (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (js-invoke java.time.Instant "from" java-time-temporal-TemporalAccessor13784))))
(clojure.core/defn is-after {:arglists (quote (["java.time.Instant" "java.time.Instant"]))} (^boolean [^js/JSJoda.Instant this13785 ^js/JSJoda.Instant java-time-Instant13786] (.isAfter this13785 java-time-Instant13786)))
(clojure.core/defn minus-nanos {:arglists (quote (["java.time.Instant" "long"]))} (^js/JSJoda.Instant [^js/JSJoda.Instant this13787 ^long long13788] (.minusNanos this13787 long13788)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalField"] ["java.time.Instant" "java.time.temporal.TemporalUnit"]))} (^boolean [this13789 G__13790] (.isSupported ^js/JSJoda.Instant this13789 G__13790)))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence"]))} (^js/JSJoda.Instant [^java.lang.CharSequence java-lang-CharSequence13791] (js-invoke java.time.Instant "parse" java-lang-CharSequence13791)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.Instant"]))} (^int [^js/JSJoda.Instant this13792] (.hashCode this13792)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.Instant" "java.time.temporal.Temporal"]))} (^js/JSJoda.Temporal [^js/JSJoda.Instant this13793 ^js/JSJoda.Temporal java-time-temporal-Temporal13794] (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.adjustInto this13793 java-time-temporal-Temporal13794))))
(clojure.core/defn with {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalAdjuster"] ["java.time.Instant" "java.time.temporal.TemporalField" "long"]))} (^js/JSJoda.Instant [^js/JSJoda.Instant this13795 ^js/JSJoda.TemporalAdjuster java-time-temporal-TemporalAdjuster13796] (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.with this13795 java-time-temporal-TemporalAdjuster13796))) (^js/JSJoda.Instant [^js/JSJoda.Instant this13797 ^js/JSJoda.TemporalField java-time-temporal-TemporalField13798 ^long long13799] (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.with this13797 java-time-temporal-TemporalField13798 long13799))))
(clojure.core/defn now {:arglists (quote ([] ["java.time.Clock"]))} (^js/JSJoda.Instant [] (js-invoke java.time.Instant "now")) (^js/JSJoda.Instant [^js/JSJoda.Clock java-time-Clock13800] (js-invoke java.time.Instant "now" java-time-Clock13800)))
(clojure.core/defn to-epoch-milli {:arglists (quote (["java.time.Instant"]))} (^long [^js/JSJoda.Instant this13801] (.toEpochMilli this13801)))
(clojure.core/defn get-epoch-second {:arglists (quote (["java.time.Instant"]))} (^long [^js/JSJoda.Instant this13802] (.epochSecond this13802)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.Instant" "java.time.Instant"]))} (^int [^js/JSJoda.Instant this13803 ^js/JSJoda.Instant java-time-Instant13804] (.compareTo this13803 java-time-Instant13804)))
(clojure.core/defn plus-seconds {:arglists (quote (["java.time.Instant" "long"]))} (^js/JSJoda.Instant [^js/JSJoda.Instant this13805 ^long long13806] (.plusSeconds this13805 long13806)))
(clojure.core/defn get {:arglists (quote (["java.time.Instant" "java.time.temporal.TemporalField"]))} (^int [^js/JSJoda.Instant this13807 ^js/JSJoda.TemporalField java-time-temporal-TemporalField13808] (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.get this13807 java-time-temporal-TemporalField13808))))
(clojure.core/defn equals {:arglists (quote (["java.time.Instant" "java.lang.Object"]))} (^boolean [^js/JSJoda.Instant this13809 ^java.lang.Object java-lang-Object13810] (.equals this13809 java-lang-Object13810)))
