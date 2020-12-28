(ns cljc.java-time.temporal.temporal (:import [java.time.temporal Temporal]) (:refer-clojure :exclude [get range format min max next name resolve short]))
(clojure.core/defn range {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.temporal.Temporal this50819 ^java.time.temporal.TemporalField java-time-temporal-TemporalField50820] (.range this50819 java-time-temporal-TemporalField50820)))
(clojure.core/defn plus {:arglists (quote (["java.time.temporal.Temporal" "long" "java.time.temporal.TemporalUnit"] ["java.time.temporal.Temporal" "java.time.temporal.TemporalAmount"]))} (^java.time.temporal.Temporal [^java.time.temporal.Temporal this50821 ^long long50822 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit50823] (.plus this50821 long50822 java-time-temporal-TemporalUnit50823)) (^java.time.temporal.Temporal [^java.time.temporal.Temporal this50824 ^java.time.temporal.TemporalAmount java-time-temporal-TemporalAmount50825] (.plus this50824 java-time-temporal-TemporalAmount50825)))
(clojure.core/defn query {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.temporal.Temporal this50826 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery50827] (.query this50826 java-time-temporal-TemporalQuery50827)))
(clojure.core/defn minus {:arglists (quote (["java.time.temporal.Temporal" "long" "java.time.temporal.TemporalUnit"] ["java.time.temporal.Temporal" "java.time.temporal.TemporalAmount"]))} (^java.time.temporal.Temporal [^java.time.temporal.Temporal this50828 ^long long50829 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit50830] (.minus this50828 long50829 java-time-temporal-TemporalUnit50830)) (^java.time.temporal.Temporal [^java.time.temporal.Temporal this50831 ^java.time.temporal.TemporalAmount java-time-temporal-TemporalAmount50832] (.minus this50831 java-time-temporal-TemporalAmount50832)))
(clojure.core/defn get-long {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalField"]))} (^long [^java.time.temporal.Temporal this50833 ^java.time.temporal.TemporalField java-time-temporal-TemporalField50834] (.getLong this50833 java-time-temporal-TemporalField50834)))
(clojure.core/defn until {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))} (^long [^java.time.temporal.Temporal this50835 ^java.time.temporal.Temporal java-time-temporal-Temporal50836 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit50837] (.until this50835 java-time-temporal-Temporal50836 java-time-temporal-TemporalUnit50837)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"] ["java.time.temporal.Temporal" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [this50838 G__50839] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__50839)) (clojure.core/let [G__50839 ^"java.time.temporal.TemporalUnit" G__50839] (.isSupported ^java.time.temporal.Temporal this50838 G__50839)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__50839)) (clojure.core/let [G__50839 ^"java.time.temporal.TemporalField" G__50839] (.isSupported ^java.time.temporal.Temporal this50838 G__50839)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn with {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalField" "long"] ["java.time.temporal.Temporal" "java.time.temporal.TemporalAdjuster"]))} (^java.time.temporal.Temporal [^java.time.temporal.Temporal this50840 ^java.time.temporal.TemporalField java-time-temporal-TemporalField50841 ^long long50842] (.with this50840 java-time-temporal-TemporalField50841 long50842)) (^java.time.temporal.Temporal [^java.time.temporal.Temporal this50843 ^java.time.temporal.TemporalAdjuster java-time-temporal-TemporalAdjuster50844] (.with this50843 java-time-temporal-TemporalAdjuster50844)))
(clojure.core/defn get {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.temporal.Temporal this50845 ^java.time.temporal.TemporalField java-time-temporal-TemporalField50846] (.get this50845 java-time-temporal-TemporalField50846)))