(ns cljc.java-time.format.decimal-style (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time.format :refer [DecimalStyle]])) (:refer-clojure :exclude [get range format min max next name resolve]) #? (:clj (:import [java.time.format DecimalStyle])))
(def standard (. java.time.format.DecimalStyle -STANDARD))
(clojure.core/defn with-decimal-separator {:arglists (quote (["java.time.format.DecimalStyle" "char"]))} (^java.time.format.DecimalStyle [^java.time.format.DecimalStyle this5012 ^java.lang.Character char5013] (.withDecimalSeparator this5012 char5013)))
(clojure.core/defn of {:arglists (quote (["java.util.Locale"]))} (^java.time.format.DecimalStyle [^java.util.Locale java-util-Locale5014] (. java.time.format.DecimalStyle of java-util-Locale5014)))
(clojure.core/defn with-positive-sign {:arglists (quote (["java.time.format.DecimalStyle" "char"]))} (^java.time.format.DecimalStyle [^java.time.format.DecimalStyle this5015 ^java.lang.Character char5016] (.withPositiveSign this5015 char5016)))
(clojure.core/defn get-decimal-separator {:arglists (quote (["java.time.format.DecimalStyle"]))} (^java.lang.Character [^java.time.format.DecimalStyle this5017] (jti/getter decimalSeparator this5017)))
(clojure.core/defn of-default-locale {:arglists (quote ([]))} (^java.time.format.DecimalStyle [] (. java.time.format.DecimalStyle ofDefaultLocale)))
(clojure.core/defn with-zero-digit {:arglists (quote (["java.time.format.DecimalStyle" "char"]))} (^java.time.format.DecimalStyle [^java.time.format.DecimalStyle this5018 ^java.lang.Character char5019] (.withZeroDigit this5018 char5019)))
(clojure.core/defn to-string {:arglists (quote (["java.time.format.DecimalStyle"]))} (^java.lang.String [^java.time.format.DecimalStyle this5020] (.toString this5020)))
(clojure.core/defn get-zero-digit {:arglists (quote (["java.time.format.DecimalStyle"]))} (^java.lang.Character [^java.time.format.DecimalStyle this5021] (jti/getter zeroDigit this5021)))
(clojure.core/defn with-negative-sign {:arglists (quote (["java.time.format.DecimalStyle" "char"]))} (^java.time.format.DecimalStyle [^java.time.format.DecimalStyle this5022 ^java.lang.Character char5023] (.withNegativeSign this5022 char5023)))
(clojure.core/defn get-available-locales {:arglists (quote ([]))} (^java.util.Set [] (. java.time.format.DecimalStyle getAvailableLocales)))
(clojure.core/defn get-positive-sign {:arglists (quote (["java.time.format.DecimalStyle"]))} (^java.lang.Character [^java.time.format.DecimalStyle this5024] (jti/getter positiveSign this5024)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.format.DecimalStyle"]))} (^java.lang.Integer [^java.time.format.DecimalStyle this5025] (.hashCode this5025)))
(clojure.core/defn get-negative-sign {:arglists (quote (["java.time.format.DecimalStyle"]))} (^java.lang.Character [^java.time.format.DecimalStyle this5026] (jti/getter negativeSign this5026)))
(clojure.core/defn equals {:arglists (quote (["java.time.format.DecimalStyle" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.format.DecimalStyle this5027 ^java.lang.Object java-lang-Object5028] (.equals this5027 java-lang-Object5028)))