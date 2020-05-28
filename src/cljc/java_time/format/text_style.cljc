(ns cljc.java-time.format.text-style (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time.format :refer [TextStyle]])) (:refer-clojure :exclude [get range format min max next name resolve]) #? (:clj (:import [java.time.format TextStyle])))
(def short (. java.time.format.TextStyle -SHORT))
(def full-standalone (. java.time.format.TextStyle -FULL_STANDALONE))
(def full (. java.time.format.TextStyle -FULL))
(def short-standalone (. java.time.format.TextStyle -SHORT_STANDALONE))
(def narrow (. java.time.format.TextStyle -NARROW))
(def narrow-standalone (. java.time.format.TextStyle -NARROW_STANDALONE))
(clojure.core/defn values {:arglists (quote ([]))} (^"java.lang.Class" [] (. java.time.format.TextStyle values)))
(clojure.core/defn value-of {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))} (^java.time.format.TextStyle [^java.lang.String java-lang-String5041] (. java.time.format.TextStyle valueOf java-lang-String5041)) (^java.lang.Enum [^java.lang.Class java-lang-Class5042 ^java.lang.String java-lang-String5043] (. java.time.format.TextStyle valueOf java-lang-Class5042 java-lang-String5043)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.format.TextStyle"]))} (^java.lang.Integer [^java.time.format.TextStyle this5044] (.ordinal this5044)))
(clojure.core/defn as-standalone {:arglists (quote (["java.time.format.TextStyle"]))} (^java.time.format.TextStyle [^java.time.format.TextStyle this5045] (.asStandalone this5045)))
(clojure.core/defn to-string {:arglists (quote (["java.time.format.TextStyle"]))} (^java.lang.String [^java.time.format.TextStyle this5046] (.toString this5046)))
(clojure.core/defn name {:arglists (quote (["java.time.format.TextStyle"]))} (^java.lang.String [^java.time.format.TextStyle this5047] (.name this5047)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.format.TextStyle"]))} (^java.lang.Class [^java.time.format.TextStyle this5048] (jti/getter declaringClass this5048)))
(clojure.core/defn as-normal {:arglists (quote (["java.time.format.TextStyle"]))} (^java.time.format.TextStyle [^java.time.format.TextStyle this5049] (.asNormal this5049)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.format.TextStyle"]))} (^java.lang.Integer [^java.time.format.TextStyle this5050] (.hashCode this5050)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.format.TextStyle" "java.lang.Object"] ["java.time.format.TextStyle" "java.lang.Enum"]))} (^java.lang.Integer [this5051 G__5052] #? (:cljs (.compareTo ^java.time.format.TextStyle this5051 G__5052) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__5052)) (clojure.core/let [G__5052 ^"java.lang.Object" G__5052] (.compareTo ^java.time.format.TextStyle this5051 G__5052)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Enum") G__5052)) (clojure.core/let [G__5052 ^"java.lang.Enum" G__5052] (.compareTo ^java.time.format.TextStyle this5051 G__5052)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn is-standalone {:arglists (quote (["java.time.format.TextStyle"]))} (^java.lang.Boolean [^java.time.format.TextStyle this5053] (.isStandalone this5053)))
(clojure.core/defn equals {:arglists (quote (["java.time.format.TextStyle" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.format.TextStyle this5054 ^java.lang.Object java-lang-Object5055] (.equals this5054 java-lang-Object5055)))