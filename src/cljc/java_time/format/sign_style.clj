(ns cljc.java-time.format.sign-style (:refer-clojure :exclude [abs get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness]) (:import [java.time.format SignStyle]))
(def exceeds-pad java.time.format.SignStyle/EXCEEDS_PAD)
(def normal java.time.format.SignStyle/NORMAL)
(def always java.time.format.SignStyle/ALWAYS)
(def never java.time.format.SignStyle/NEVER)
(def not-negative java.time.format.SignStyle/NOT_NEGATIVE)
(clojure.core/defn values {:arglists (quote ([]))} (^"java.lang.Class" [] (java.time.format.SignStyle/values)))
(clojure.core/defn value-of {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))} (^java.time.format.SignStyle [^java.lang.String java-lang-String16178] (java.time.format.SignStyle/valueOf java-lang-String16178)) (^java.lang.Enum [^java.lang.Class java-lang-Class16179 ^java.lang.String java-lang-String16180] (java.time.format.SignStyle/valueOf java-lang-Class16179 java-lang-String16180)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.format.SignStyle"]))} (^java.lang.Integer [^java.time.format.SignStyle this16181] (.ordinal this16181)))
(clojure.core/defn to-string {:arglists (quote (["java.time.format.SignStyle"]))} (^java.lang.String [^java.time.format.SignStyle this16182] (.toString this16182)))
(clojure.core/defn name {:arglists (quote (["java.time.format.SignStyle"]))} (^java.lang.String [^java.time.format.SignStyle this16183] (.name this16183)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.format.SignStyle"]))} (^java.lang.Class [^java.time.format.SignStyle this16184] (.getDeclaringClass this16184)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.format.SignStyle"]))} (^java.lang.Integer [^java.time.format.SignStyle this16185] (.hashCode this16185)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.format.SignStyle" "java.lang.Enum"]))} (^java.lang.Integer [^java.time.format.SignStyle this16186 ^java.lang.Enum java-lang-Enum16187] (.compareTo this16186 java-lang-Enum16187)))
(clojure.core/defn equals {:arglists (quote (["java.time.format.SignStyle" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.format.SignStyle this16188 ^java.lang.Object java-lang-Object16189] (.equals this16188 java-lang-Object16189)))
