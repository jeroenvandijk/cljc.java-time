(ns cljc.java-time.format.date-time-formatter (:refer-clojure :exclude [abs get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness] [goog.object] [java.time.format :refer [DateTimeFormatter]]))
(def iso-local-time (goog.object/get java.time.format.DateTimeFormatter "ISO_LOCAL_TIME"))
(def iso-ordinal-date (goog.object/get java.time.format.DateTimeFormatter "ISO_ORDINAL_DATE"))
(def iso-offset-date (goog.object/get java.time.format.DateTimeFormatter "ISO_OFFSET_DATE"))
(def iso-time (goog.object/get java.time.format.DateTimeFormatter "ISO_TIME"))
(def iso-local-date-time (goog.object/get java.time.format.DateTimeFormatter "ISO_LOCAL_DATE_TIME"))
(def iso-instant (goog.object/get java.time.format.DateTimeFormatter "ISO_INSTANT"))
(def rfc-1123-date-time (goog.object/get java.time.format.DateTimeFormatter "RFC_1123_DATE_TIME"))
(def iso-date (goog.object/get java.time.format.DateTimeFormatter "ISO_DATE"))
(def iso-week-date (goog.object/get java.time.format.DateTimeFormatter "ISO_WEEK_DATE"))
(def iso-offset-time (goog.object/get java.time.format.DateTimeFormatter "ISO_OFFSET_TIME"))
(def iso-local-date (goog.object/get java.time.format.DateTimeFormatter "ISO_LOCAL_DATE"))
(def iso-zoned-date-time (goog.object/get java.time.format.DateTimeFormatter "ISO_ZONED_DATE_TIME"))
(def iso-offset-date-time (goog.object/get java.time.format.DateTimeFormatter "ISO_OFFSET_DATE_TIME"))
(def iso-date-time (goog.object/get java.time.format.DateTimeFormatter "ISO_DATE_TIME"))
(def basic-iso-date (goog.object/get java.time.format.DateTimeFormatter "BASIC_ISO_DATE"))
(clojure.core/defn of-pattern {:arglists (quote (["java.lang.String"] ["java.lang.String" "java.util.Locale"]))} (^js/JSJoda.DateTimeFormatter [^java.lang.String java-lang-String15920] (js-invoke java.time.format.DateTimeFormatter "ofPattern" java-lang-String15920)) (^js/JSJoda.DateTimeFormatter [^java.lang.String java-lang-String15921 ^java.util.Locale java-util-Locale15922] (js-invoke java.time.format.DateTimeFormatter "ofPattern" java-lang-String15921 java-util-Locale15922)))
(clojure.core/defn parse-best {:arglists (quote (["java.time.format.DateTimeFormatter" "java.lang.CharSequence" "[Ljava.time.temporal.TemporalQuery;"]))} (^js/JSJoda.TemporalAccessor [^js/JSJoda.DateTimeFormatter this15923 ^java.lang.CharSequence java-lang-CharSequence15924 ^"java.lang.Class" java-time-temporal-TemporalQuery-array15925] (.parseBest this15923 java-lang-CharSequence15924 java-time-temporal-TemporalQuery-array15925)))
(clojure.core/defn format-to {:arglists (quote (["java.time.format.DateTimeFormatter" "java.time.temporal.TemporalAccessor" "java.lang.Appendable"]))} (^void [^js/JSJoda.DateTimeFormatter this15926 ^js/JSJoda.TemporalAccessor java-time-temporal-TemporalAccessor15927 ^java.lang.Appendable java-lang-Appendable15928] (.formatTo this15926 java-time-temporal-TemporalAccessor15927 java-lang-Appendable15928)))
(clojure.core/defn get-decimal-style {:arglists (quote (["java.time.format.DateTimeFormatter"]))} (^js/JSJoda.DecimalStyle [^js/JSJoda.DateTimeFormatter this15929] (.decimalStyle this15929)))
(clojure.core/defn with-chronology {:arglists (quote (["java.time.format.DateTimeFormatter" "java.time.chrono.Chronology"]))} (^js/JSJoda.DateTimeFormatter [^js/JSJoda.DateTimeFormatter this15930 ^js/JSJoda.Chronology java-time-chrono-Chronology15931] (.withChronology this15930 java-time-chrono-Chronology15931)))
(clojure.core/defn get-resolver-style {:arglists (quote (["java.time.format.DateTimeFormatter"]))} (^js/JSJoda.ResolverStyle [^js/JSJoda.DateTimeFormatter this15932] (.resolverStyle this15932)))
(clojure.core/defn with-decimal-style {:arglists (quote (["java.time.format.DateTimeFormatter" "java.time.format.DecimalStyle"]))} (^js/JSJoda.DateTimeFormatter [^js/JSJoda.DateTimeFormatter this15933 ^js/JSJoda.DecimalStyle java-time-format-DecimalStyle15934] (.withDecimalStyle this15933 java-time-format-DecimalStyle15934)))
(clojure.core/defn get-locale {:arglists (quote (["java.time.format.DateTimeFormatter"]))} (^java.util.Locale [^js/JSJoda.DateTimeFormatter this15935] (.locale this15935)))
(clojure.core/defn to-string {:arglists (quote (["java.time.format.DateTimeFormatter"]))} (^java.lang.String [^js/JSJoda.DateTimeFormatter this15936] (.toString this15936)))
(clojure.core/defn parsed-leap-second {:arglists (quote ([]))} (^js/JSJoda.TemporalQuery [] (js-invoke java.time.format.DateTimeFormatter "parsedLeapSecond")))
(clojure.core/defn with-zone {:arglists (quote (["java.time.format.DateTimeFormatter" "java.time.ZoneId"]))} (^js/JSJoda.DateTimeFormatter [^js/JSJoda.DateTimeFormatter this15937 ^js/JSJoda.ZoneId java-time-ZoneId15938] (.withZone this15937 java-time-ZoneId15938)))
(clojure.core/defn parsed-excess-days {:arglists (quote ([]))} (^js/JSJoda.TemporalQuery [] (js-invoke java.time.format.DateTimeFormatter "parsedExcessDays")))
(clojure.core/defn get-zone {:arglists (quote (["java.time.format.DateTimeFormatter"]))} (^js/JSJoda.ZoneId [^js/JSJoda.DateTimeFormatter this15939] (.zone this15939)))
(clojure.core/defn of-localized-date-time {:arglists (quote (["java.time.format.FormatStyle"] ["java.time.format.FormatStyle" "java.time.format.FormatStyle"]))} (^js/JSJoda.DateTimeFormatter [^js/JSJoda.FormatStyle java-time-format-FormatStyle15940] (js-invoke java.time.format.DateTimeFormatter "ofLocalizedDateTime" java-time-format-FormatStyle15940)) (^js/JSJoda.DateTimeFormatter [^js/JSJoda.FormatStyle java-time-format-FormatStyle15941 ^js/JSJoda.FormatStyle java-time-format-FormatStyle15942] (js-invoke java.time.format.DateTimeFormatter "ofLocalizedDateTime" java-time-format-FormatStyle15941 java-time-format-FormatStyle15942)))
(clojure.core/defn get-resolver-fields {:arglists (quote (["java.time.format.DateTimeFormatter"]))} (^java.util.Set [^js/JSJoda.DateTimeFormatter this15943] (.resolverFields this15943)))
(clojure.core/defn get-chronology {:arglists (quote (["java.time.format.DateTimeFormatter"]))} (^js/JSJoda.Chronology [^js/JSJoda.DateTimeFormatter this15944] (.chronology this15944)))
(clojure.core/defn parse {:arglists (quote (["java.time.format.DateTimeFormatter" "java.lang.CharSequence" "java.time.temporal.TemporalQuery"] ["java.time.format.DateTimeFormatter" "java.lang.CharSequence"] ["java.time.format.DateTimeFormatter" "java.lang.CharSequence" "java.text.ParsePosition"]))} (^java.lang.Object [this15945 G__15946 G__15947] (.parse ^js/JSJoda.DateTimeFormatter this15945 G__15946 G__15947)) (^js/JSJoda.TemporalAccessor [^js/JSJoda.DateTimeFormatter this15948 ^java.lang.CharSequence java-lang-CharSequence15949] (.parse this15948 java-lang-CharSequence15949)))
(clojure.core/defn with-locale {:arglists (quote (["java.time.format.DateTimeFormatter" "java.util.Locale"]))} (^js/JSJoda.DateTimeFormatter [^js/JSJoda.DateTimeFormatter this15950 ^java.util.Locale java-util-Locale15951] (.withLocale this15950 java-util-Locale15951)))
(clojure.core/defn with-resolver-fields {:arglists (quote (["java.time.format.DateTimeFormatter" "java.util.Set"] ["java.time.format.DateTimeFormatter" "[Ljava.time.temporal.TemporalField;"]))} (^js/JSJoda.DateTimeFormatter [this15952 G__15953] (.withResolverFields ^js/JSJoda.DateTimeFormatter this15952 G__15953)))
(clojure.core/defn parse-unresolved {:arglists (quote (["java.time.format.DateTimeFormatter" "java.lang.CharSequence" "java.text.ParsePosition"]))} (^js/JSJoda.TemporalAccessor [^js/JSJoda.DateTimeFormatter this15954 ^java.lang.CharSequence java-lang-CharSequence15955 ^java.text.ParsePosition java-text-ParsePosition15956] (.parseUnresolved this15954 java-lang-CharSequence15955 java-text-ParsePosition15956)))
(clojure.core/defn of-localized-time {:arglists (quote (["java.time.format.FormatStyle"]))} (^js/JSJoda.DateTimeFormatter [^js/JSJoda.FormatStyle java-time-format-FormatStyle15957] (js-invoke java.time.format.DateTimeFormatter "ofLocalizedTime" java-time-format-FormatStyle15957)))
(clojure.core/defn of-localized-date {:arglists (quote (["java.time.format.FormatStyle"]))} (^js/JSJoda.DateTimeFormatter [^js/JSJoda.FormatStyle java-time-format-FormatStyle15958] (js-invoke java.time.format.DateTimeFormatter "ofLocalizedDate" java-time-format-FormatStyle15958)))
(clojure.core/defn format {:arglists (quote (["java.time.format.DateTimeFormatter" "java.time.temporal.TemporalAccessor"]))} (^java.lang.String [^js/JSJoda.DateTimeFormatter this15959 ^js/JSJoda.TemporalAccessor java-time-temporal-TemporalAccessor15960] (cljc.java-time.extn.calendar-awareness/calendar-aware-cljs (.format this15959 java-time-temporal-TemporalAccessor15960))))
(clojure.core/defn to-format {:arglists (quote (["java.time.format.DateTimeFormatter"] ["java.time.format.DateTimeFormatter" "java.time.temporal.TemporalQuery"]))} (^java.text.Format [^js/JSJoda.DateTimeFormatter this15961] (.toFormat this15961)) (^java.text.Format [^js/JSJoda.DateTimeFormatter this15962 ^js/JSJoda.TemporalQuery java-time-temporal-TemporalQuery15963] (.toFormat this15962 java-time-temporal-TemporalQuery15963)))
(clojure.core/defn with-resolver-style {:arglists (quote (["java.time.format.DateTimeFormatter" "java.time.format.ResolverStyle"]))} (^js/JSJoda.DateTimeFormatter [^js/JSJoda.DateTimeFormatter this15964 ^js/JSJoda.ResolverStyle java-time-format-ResolverStyle15965] (.withResolverStyle this15964 java-time-format-ResolverStyle15965)))
