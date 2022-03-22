(ns cljc.java-time.format.decimal-style (:refer-clojure :exclude [abs get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness] [goog.object] [java.time.format :refer [DecimalStyle]]))
(def standard (goog.object/get java.time.format.DecimalStyle "STANDARD"))
(clojure.core/defn with-decimal-separator {:arglists (quote (["java.time.format.DecimalStyle" "char"]))} (^js/JSJoda.DecimalStyle [^js/JSJoda.DecimalStyle this16161 ^char char16162] (.withDecimalSeparator this16161 char16162)))
(clojure.core/defn of {:arglists (quote (["java.util.Locale"]))} (^js/JSJoda.DecimalStyle [^java.util.Locale java-util-Locale16163] (js-invoke java.time.format.DecimalStyle "of" java-util-Locale16163)))
(clojure.core/defn with-positive-sign {:arglists (quote (["java.time.format.DecimalStyle" "char"]))} (^js/JSJoda.DecimalStyle [^js/JSJoda.DecimalStyle this16164 ^char char16165] (.withPositiveSign this16164 char16165)))
(clojure.core/defn get-decimal-separator {:arglists (quote (["java.time.format.DecimalStyle"]))} (^char [^js/JSJoda.DecimalStyle this16166] (.decimalSeparator this16166)))
(clojure.core/defn of-default-locale {:arglists (quote ([]))} (^js/JSJoda.DecimalStyle [] (js-invoke java.time.format.DecimalStyle "ofDefaultLocale")))
(clojure.core/defn with-zero-digit {:arglists (quote (["java.time.format.DecimalStyle" "char"]))} (^js/JSJoda.DecimalStyle [^js/JSJoda.DecimalStyle this16167 ^char char16168] (.withZeroDigit this16167 char16168)))
(clojure.core/defn to-string {:arglists (quote (["java.time.format.DecimalStyle"]))} (^java.lang.String [^js/JSJoda.DecimalStyle this16169] (.toString this16169)))
(clojure.core/defn get-zero-digit {:arglists (quote (["java.time.format.DecimalStyle"]))} (^char [^js/JSJoda.DecimalStyle this16170] (.zeroDigit this16170)))
(clojure.core/defn with-negative-sign {:arglists (quote (["java.time.format.DecimalStyle" "char"]))} (^js/JSJoda.DecimalStyle [^js/JSJoda.DecimalStyle this16171 ^char char16172] (.withNegativeSign this16171 char16172)))
(clojure.core/defn get-available-locales {:arglists (quote ([]))} (^java.util.Set [] (js-invoke java.time.format.DecimalStyle "getAvailableLocales")))
(clojure.core/defn get-positive-sign {:arglists (quote (["java.time.format.DecimalStyle"]))} (^char [^js/JSJoda.DecimalStyle this16173] (.positiveSign this16173)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.format.DecimalStyle"]))} (^int [^js/JSJoda.DecimalStyle this16174] (.hashCode this16174)))
(clojure.core/defn get-negative-sign {:arglists (quote (["java.time.format.DecimalStyle"]))} (^char [^js/JSJoda.DecimalStyle this16175] (.negativeSign this16175)))
(clojure.core/defn equals {:arglists (quote (["java.time.format.DecimalStyle" "java.lang.Object"]))} (^boolean [^js/JSJoda.DecimalStyle this16176 ^java.lang.Object java-lang-Object16177] (.equals this16176 java-lang-Object16177)))
