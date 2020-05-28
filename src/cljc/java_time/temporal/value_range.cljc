(ns cljc.java-time.temporal.value-range (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time.temporal :refer [ValueRange]])) (:refer-clojure :exclude [get range format min max next name resolve]) #? (:clj (:import [java.time.temporal ValueRange])))
(clojure.core/defn get-minimum {:arglists (quote (["java.time.temporal.ValueRange"]))} (^long [^java.time.temporal.ValueRange this4827] (jti/getter minimum this4827)))
(clojure.core/defn of {:arglists (quote (["long" "long"] ["long" "long" "long" "long"] ["long" "long" "long"]))} (^java.time.temporal.ValueRange [^long long4828 ^long long4829] (. java.time.temporal.ValueRange of long4828 long4829)) (^java.time.temporal.ValueRange [^long long4830 ^long long4831 ^long long4832 ^long long4833] (. java.time.temporal.ValueRange of long4830 long4831 long4832 long4833)) (^java.time.temporal.ValueRange [^long long4834 ^long long4835 ^long long4836] (. java.time.temporal.ValueRange of long4834 long4835 long4836)))
(clojure.core/defn is-valid-value {:arglists (quote (["java.time.temporal.ValueRange" "long"]))} (^java.lang.Boolean [^java.time.temporal.ValueRange this4837 ^long long4838] (.isValidValue this4837 long4838)))
(clojure.core/defn check-valid-int-value {:arglists (quote (["java.time.temporal.ValueRange" "long" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.temporal.ValueRange this4839 ^long long4840 ^java.time.temporal.TemporalField java-time-temporal-TemporalField4841] (.checkValidIntValue this4839 long4840 java-time-temporal-TemporalField4841)))
(clojure.core/defn to-string {:arglists (quote (["java.time.temporal.ValueRange"]))} (^java.lang.String [^java.time.temporal.ValueRange this4842] (.toString this4842)))
(clojure.core/defn is-int-value {:arglists (quote (["java.time.temporal.ValueRange"]))} (^java.lang.Boolean [^java.time.temporal.ValueRange this4843] (.isIntValue this4843)))
(clojure.core/defn get-smallest-maximum {:arglists (quote (["java.time.temporal.ValueRange"]))} (^long [^java.time.temporal.ValueRange this4844] (jti/getter smallestMaximum this4844)))
(clojure.core/defn is-valid-int-value {:arglists (quote (["java.time.temporal.ValueRange" "long"]))} (^java.lang.Boolean [^java.time.temporal.ValueRange this4845 ^long long4846] (.isValidIntValue this4845 long4846)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.temporal.ValueRange"]))} (^java.lang.Integer [^java.time.temporal.ValueRange this4847] (.hashCode this4847)))
(clojure.core/defn is-fixed {:arglists (quote (["java.time.temporal.ValueRange"]))} (^java.lang.Boolean [^java.time.temporal.ValueRange this4848] (.isFixed this4848)))
(clojure.core/defn get-maximum {:arglists (quote (["java.time.temporal.ValueRange"]))} (^long [^java.time.temporal.ValueRange this4849] (jti/getter maximum this4849)))
(clojure.core/defn equals {:arglists (quote (["java.time.temporal.ValueRange" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.temporal.ValueRange this4850 ^java.lang.Object java-lang-Object4851] (.equals this4850 java-lang-Object4851)))
(clojure.core/defn get-largest-minimum {:arglists (quote (["java.time.temporal.ValueRange"]))} (^long [^java.time.temporal.ValueRange this4852] (jti/getter largestMinimum this4852)))
(clojure.core/defn check-valid-value {:arglists (quote (["java.time.temporal.ValueRange" "long" "java.time.temporal.TemporalField"]))} (^long [^java.time.temporal.ValueRange this4853 ^long long4854 ^java.time.temporal.TemporalField java-time-temporal-TemporalField4855] (.checkValidValue this4853 long4854 java-time-temporal-TemporalField4855)))