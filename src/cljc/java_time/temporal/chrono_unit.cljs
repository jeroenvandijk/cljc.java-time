(ns cljc.java-time.temporal.chrono-unit (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness] [java.time.temporal :refer [ChronoUnit]]))
(def millis (goog.object/get java.time.temporal.ChronoUnit "MILLIS"))
(def minutes (goog.object/get java.time.temporal.ChronoUnit "MINUTES"))
(def micros (goog.object/get java.time.temporal.ChronoUnit "MICROS"))
(def half-days (goog.object/get java.time.temporal.ChronoUnit "HALF_DAYS"))
(def millennia (goog.object/get java.time.temporal.ChronoUnit "MILLENNIA"))
(def years (goog.object/get java.time.temporal.ChronoUnit "YEARS"))
(def decades (goog.object/get java.time.temporal.ChronoUnit "DECADES"))
(def days (goog.object/get java.time.temporal.ChronoUnit "DAYS"))
(def centuries (goog.object/get java.time.temporal.ChronoUnit "CENTURIES"))
(def weeks (goog.object/get java.time.temporal.ChronoUnit "WEEKS"))
(def hours (goog.object/get java.time.temporal.ChronoUnit "HOURS"))
(def eras (goog.object/get java.time.temporal.ChronoUnit "ERAS"))
(def seconds (goog.object/get java.time.temporal.ChronoUnit "SECONDS"))
(def months (goog.object/get java.time.temporal.ChronoUnit "MONTHS"))
(def nanos (goog.object/get java.time.temporal.ChronoUnit "NANOS"))
(def forever (goog.object/get java.time.temporal.ChronoUnit "FOREVER"))
(clojure.core/defn values {:arglists (quote ([]))} (^"java.lang.Class" [] (js-invoke java.time.temporal.ChronoUnit "values")))
(clojure.core/defn value-of {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))} (^js/JSJoda.ChronoUnit [^java.lang.String java-lang-String8688] (js-invoke java.time.temporal.ChronoUnit "valueOf" java-lang-String8688)) (^java.lang.Enum [^java.lang.Class java-lang-Class8689 ^java.lang.String java-lang-String8690] (js-invoke java.time.temporal.ChronoUnit "valueOf" java-lang-Class8689 java-lang-String8690)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.temporal.ChronoUnit"]))} (^int [^js/JSJoda.ChronoUnit this8691] (.ordinal this8691)))
(clojure.core/defn is-duration-estimated {:arglists (quote (["java.time.temporal.ChronoUnit"]))} (^boolean [^js/JSJoda.ChronoUnit this8692] (.isDurationEstimated this8692)))
(clojure.core/defn to-string {:arglists (quote (["java.time.temporal.ChronoUnit"]))} (^java.lang.String [^js/JSJoda.ChronoUnit this8693] (.toString this8693)))
(clojure.core/defn is-date-based {:arglists (quote (["java.time.temporal.ChronoUnit"]))} (^boolean [^js/JSJoda.ChronoUnit this8694] (.isDateBased this8694)))
(clojure.core/defn add-to {:arglists (quote (["java.time.temporal.ChronoUnit" "java.time.temporal.Temporal" "long"]))} (^js/JSJoda.Temporal [^js/JSJoda.ChronoUnit this8695 ^js/JSJoda.Temporal java-time-temporal-Temporal8696 ^long long8697] (.addTo this8695 java-time-temporal-Temporal8696 long8697)))
(clojure.core/defn name {:arglists (quote (["java.time.temporal.ChronoUnit"]))} (^java.lang.String [^js/JSJoda.ChronoUnit this8698] (.name this8698)))
(clojure.core/defn is-supported-by {:arglists (quote (["java.time.temporal.ChronoUnit" "java.time.temporal.Temporal"]))} (^boolean [^js/JSJoda.ChronoUnit this8699 ^js/JSJoda.Temporal java-time-temporal-Temporal8700] (.isSupportedBy this8699 java-time-temporal-Temporal8700)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.temporal.ChronoUnit"]))} (^java.lang.Class [^js/JSJoda.ChronoUnit this8701] (.declaringClass this8701)))
(clojure.core/defn between {:arglists (quote (["java.time.temporal.ChronoUnit" "java.time.temporal.Temporal" "java.time.temporal.Temporal"]))} (^long [^js/JSJoda.ChronoUnit this8702 ^js/JSJoda.Temporal java-time-temporal-Temporal8703 ^js/JSJoda.Temporal java-time-temporal-Temporal8704] (.between this8702 java-time-temporal-Temporal8703 java-time-temporal-Temporal8704)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.temporal.ChronoUnit"]))} (^int [^js/JSJoda.ChronoUnit this8705] (.hashCode this8705)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.temporal.ChronoUnit" "java.lang.Object"] ["java.time.temporal.ChronoUnit" "java.lang.Enum"]))} (^int [this8706 G__8707] (.compareTo ^js/JSJoda.ChronoUnit this8706 G__8707)))
(clojure.core/defn get-duration {:arglists (quote (["java.time.temporal.ChronoUnit"]))} (^js/JSJoda.Duration [^js/JSJoda.ChronoUnit this8708] (.duration this8708)))
(clojure.core/defn equals {:arglists (quote (["java.time.temporal.ChronoUnit" "java.lang.Object"]))} (^boolean [^js/JSJoda.ChronoUnit this8709 ^java.lang.Object java-lang-Object8710] (.equals this8709 java-lang-Object8710)))
(clojure.core/defn is-time-based {:arglists (quote (["java.time.temporal.ChronoUnit"]))} (^boolean [^js/JSJoda.ChronoUnit this8711] (.isTimeBased this8711)))
