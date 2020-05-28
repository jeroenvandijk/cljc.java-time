(ns cljc.java-time.format.sign-style (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time.format :refer [SignStyle]])) (:refer-clojure :exclude [get range format min max next name resolve]) #? (:clj (:import [java.time.format SignStyle])))
(def exceeds-pad (. java.time.format.SignStyle -EXCEEDS_PAD))
(def normal (. java.time.format.SignStyle -NORMAL))
(def always (. java.time.format.SignStyle -ALWAYS))
(def never (. java.time.format.SignStyle -NEVER))
(def not-negative (. java.time.format.SignStyle -NOT_NEGATIVE))
(clojure.core/defn values {:arglists (quote ([]))} (^"java.lang.Class" [] (. java.time.format.SignStyle values)))
(clojure.core/defn value-of {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))} (^java.time.format.SignStyle [^java.lang.String java-lang-String5029] (. java.time.format.SignStyle valueOf java-lang-String5029)) (^java.lang.Enum [^java.lang.Class java-lang-Class5030 ^java.lang.String java-lang-String5031] (. java.time.format.SignStyle valueOf java-lang-Class5030 java-lang-String5031)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.format.SignStyle"]))} (^java.lang.Integer [^java.time.format.SignStyle this5032] (.ordinal this5032)))
(clojure.core/defn to-string {:arglists (quote (["java.time.format.SignStyle"]))} (^java.lang.String [^java.time.format.SignStyle this5033] (.toString this5033)))
(clojure.core/defn name {:arglists (quote (["java.time.format.SignStyle"]))} (^java.lang.String [^java.time.format.SignStyle this5034] (.name this5034)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.format.SignStyle"]))} (^java.lang.Class [^java.time.format.SignStyle this5035] (jti/getter declaringClass this5035)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.format.SignStyle"]))} (^java.lang.Integer [^java.time.format.SignStyle this5036] (.hashCode this5036)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.format.SignStyle" "java.lang.Object"] ["java.time.format.SignStyle" "java.lang.Enum"]))} (^java.lang.Integer [this5037 G__5038] #? (:cljs (.compareTo ^java.time.format.SignStyle this5037 G__5038) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__5038)) (clojure.core/let [G__5038 ^"java.lang.Object" G__5038] (.compareTo ^java.time.format.SignStyle this5037 G__5038)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Enum") G__5038)) (clojure.core/let [G__5038 ^"java.lang.Enum" G__5038] (.compareTo ^java.time.format.SignStyle this5037 G__5038)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn equals {:arglists (quote (["java.time.format.SignStyle" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.format.SignStyle this5039 ^java.lang.Object java-lang-Object5040] (.equals this5039 java-lang-Object5040)))