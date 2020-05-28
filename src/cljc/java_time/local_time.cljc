(ns cljc.java-time.local-time (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [LocalTime]])) (:refer-clojure :exclude [get range format min max next name resolve]) #? (:clj (:import [java.time LocalTime])))
(def max (. java.time.LocalTime -MAX))
(def noon (. java.time.LocalTime -NOON))
(def midnight (. java.time.LocalTime -MIDNIGHT))
(def min (. java.time.LocalTime -MIN))
(clojure.core/defn minus-minutes {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this4240 ^long long4241] (.minusMinutes this4240 long4241)))
(clojure.core/defn truncated-to {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalUnit"]))} (^java.time.LocalTime [^java.time.LocalTime this4242 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit4243] (.truncatedTo this4242 java-time-temporal-TemporalUnit4243)))
(clojure.core/defn range {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.LocalTime this4244 ^java.time.temporal.TemporalField java-time-temporal-TemporalField4245] (.range this4244 java-time-temporal-TemporalField4245)))
(clojure.core/defn get-hour {:arglists (quote (["java.time.LocalTime"]))} (^java.lang.Integer [^java.time.LocalTime this4246] (jti/getter hour this4246)))
(clojure.core/defn at-offset {:arglists (quote (["java.time.LocalTime" "java.time.ZoneOffset"]))} (^java.time.OffsetTime [^java.time.LocalTime this4247 ^java.time.ZoneOffset java-time-ZoneOffset4248] (.atOffset this4247 java-time-ZoneOffset4248)))
(clojure.core/defn minus-hours {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this4249 ^long long4250] (.minusHours this4249 long4250)))
(clojure.core/defn of {:arglists (quote (["int" "int" "int"] ["int" "int" "int" "int"] ["int" "int"]))} (^java.time.LocalTime [^java.lang.Integer int4251 ^java.lang.Integer int4252 ^java.lang.Integer int4253] (. java.time.LocalTime of int4251 int4252 int4253)) (^java.time.LocalTime [^java.lang.Integer int4254 ^java.lang.Integer int4255 ^java.lang.Integer int4256 ^java.lang.Integer int4257] (. java.time.LocalTime of int4254 int4255 int4256 int4257)) (^java.time.LocalTime [^java.lang.Integer int4258 ^java.lang.Integer int4259] (. java.time.LocalTime of int4258 int4259)))
(clojure.core/defn get-nano {:arglists (quote (["java.time.LocalTime"]))} (^java.lang.Integer [^java.time.LocalTime this4260] (jti/getter nano this4260)))
(clojure.core/defn minus-seconds {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this4261 ^long long4262] (.minusSeconds this4261 long4262)))
(clojure.core/defn get-second {:arglists (quote (["java.time.LocalTime"]))} (^java.lang.Integer [^java.time.LocalTime this4263] (jti/getter second this4263)))
(clojure.core/defn plus-nanos {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this4264 ^long long4265] (.plusNanos this4264 long4265)))
(clojure.core/defn plus {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalAmount"] ["java.time.LocalTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalTime" "java.time.temporal.TemporalAmount"]))} (^java.lang.Object [this4266 G__4267] #? (:cljs (.plus ^java.time.LocalTime this4266 G__4267) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__4267)) (clojure.core/let [G__4267 ^"java.time.temporal.TemporalAmount" G__4267] (.plus ^java.time.LocalTime this4266 G__4267)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__4267)) (clojure.core/let [G__4267 ^"java.time.temporal.TemporalAmount" G__4267] (.plus ^java.time.LocalTime this4266 G__4267)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this4268 G__4269 G__4270] #? (:cljs (.plus ^java.time.LocalTime this4268 G__4269 G__4270) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__4269) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__4270)) (clojure.core/let [G__4269 (clojure.core/long G__4269) G__4270 ^"java.time.temporal.TemporalUnit" G__4270] (.plus ^java.time.LocalTime this4268 G__4269 G__4270)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__4269) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__4270)) (clojure.core/let [G__4269 (clojure.core/long G__4269) G__4270 ^"java.time.temporal.TemporalUnit" G__4270] (.plus ^java.time.LocalTime this4268 G__4269 G__4270)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn with-hour {:arglists (quote (["java.time.LocalTime" "int"]))} (^java.time.LocalTime [^java.time.LocalTime this4271 ^java.lang.Integer int4272] (.withHour this4271 int4272)))
(clojure.core/defn with-minute {:arglists (quote (["java.time.LocalTime" "int"]))} (^java.time.LocalTime [^java.time.LocalTime this4273 ^java.lang.Integer int4274] (.withMinute this4273 int4274)))
(clojure.core/defn plus-minutes {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this4275 ^long long4276] (.plusMinutes this4275 long4276)))
(clojure.core/defn query {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.LocalTime this4277 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery4278] (.query this4277 java-time-temporal-TemporalQuery4278)))
(clojure.core/defn at-date {:arglists (quote (["java.time.LocalTime" "java.time.LocalDate"]))} (^java.time.LocalDateTime [^java.time.LocalTime this4279 ^java.time.LocalDate java-time-LocalDate4280] (.atDate this4279 java-time-LocalDate4280)))
(clojure.core/defn to-string {:arglists (quote (["java.time.LocalTime"]))} (^java.lang.String [^java.time.LocalTime this4281] (.toString this4281)))
(clojure.core/defn is-before {:arglists (quote (["java.time.LocalTime" "java.time.LocalTime"]))} (^java.lang.Boolean [^java.time.LocalTime this4282 ^java.time.LocalTime java-time-LocalTime4283] (.isBefore this4282 java-time-LocalTime4283)))
(clojure.core/defn minus {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalAmount"] ["java.time.LocalTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalTime" "java.time.temporal.TemporalAmount"] ["java.time.LocalTime" "long" "java.time.temporal.TemporalUnit"]))} (^java.lang.Object [this4284 G__4285] #? (:cljs (.minus ^java.time.LocalTime this4284 G__4285) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__4285)) (clojure.core/let [G__4285 ^"java.time.temporal.TemporalAmount" G__4285] (.minus ^java.time.LocalTime this4284 G__4285)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__4285)) (clojure.core/let [G__4285 ^"java.time.temporal.TemporalAmount" G__4285] (.minus ^java.time.LocalTime this4284 G__4285)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this4286 G__4287 G__4288] #? (:cljs (.minus ^java.time.LocalTime this4286 G__4287 G__4288) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__4287) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__4288)) (clojure.core/let [G__4287 (clojure.core/long G__4287) G__4288 ^"java.time.temporal.TemporalUnit" G__4288] (.minus ^java.time.LocalTime this4286 G__4287 G__4288)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__4287) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__4288)) (clojure.core/let [G__4287 (clojure.core/long G__4287) G__4288 ^"java.time.temporal.TemporalUnit" G__4288] (.minus ^java.time.LocalTime this4286 G__4287 G__4288)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn plus-hours {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this4289 ^long long4290] (.plusHours this4289 long4290)))
(clojure.core/defn to-second-of-day {:arglists (quote (["java.time.LocalTime"]))} (^java.lang.Integer [^java.time.LocalTime this4291] (.toSecondOfDay this4291)))
(clojure.core/defn get-long {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalField"]))} (^long [^java.time.LocalTime this4292 ^java.time.temporal.TemporalField java-time-temporal-TemporalField4293] (.getLong this4292 java-time-temporal-TemporalField4293)))
(clojure.core/defn with-nano {:arglists (quote (["java.time.LocalTime" "int"]))} (^java.time.LocalTime [^java.time.LocalTime this4294 ^java.lang.Integer int4295] (.withNano this4294 int4295)))
(clojure.core/defn until {:arglists (quote (["java.time.LocalTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))} (^long [^java.time.LocalTime this4296 ^java.time.temporal.Temporal java-time-temporal-Temporal4297 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit4298] (.until this4296 java-time-temporal-Temporal4297 java-time-temporal-TemporalUnit4298)))
(clojure.core/defn of-nano-of-day {:arglists (quote (["long"]))} (^java.time.LocalTime [^long long4299] (. java.time.LocalTime ofNanoOfDay long4299)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.LocalTime [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor4300] (. java.time.LocalTime from java-time-temporal-TemporalAccessor4300)))
(clojure.core/defn is-after {:arglists (quote (["java.time.LocalTime" "java.time.LocalTime"]))} (^java.lang.Boolean [^java.time.LocalTime this4301 ^java.time.LocalTime java-time-LocalTime4302] (.isAfter this4301 java-time-LocalTime4302)))
(clojure.core/defn minus-nanos {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this4303 ^long long4304] (.minusNanos this4303 long4304)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalUnit"] ["java.time.LocalTime" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [this4305 G__4306] #? (:cljs (.isSupported ^java.time.LocalTime this4305 G__4306) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__4306)) (clojure.core/let [G__4306 ^"java.time.temporal.TemporalUnit" G__4306] (.isSupported ^java.time.LocalTime this4305 G__4306)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__4306)) (clojure.core/let [G__4306 ^"java.time.temporal.TemporalField" G__4306] (.isSupported ^java.time.LocalTime this4305 G__4306)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence" "java.time.format.DateTimeFormatter"] ["java.lang.CharSequence"]))} (^java.time.LocalTime [^java.lang.CharSequence java-lang-CharSequence4307 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter4308] (. java.time.LocalTime parse java-lang-CharSequence4307 java-time-format-DateTimeFormatter4308)) (^java.time.LocalTime [^java.lang.CharSequence java-lang-CharSequence4309] (. java.time.LocalTime parse java-lang-CharSequence4309)))
(clojure.core/defn with-second {:arglists (quote (["java.time.LocalTime" "int"]))} (^java.time.LocalTime [^java.time.LocalTime this4310 ^java.lang.Integer int4311] (.withSecond this4310 int4311)))
(clojure.core/defn get-minute {:arglists (quote (["java.time.LocalTime"]))} (^java.lang.Integer [^java.time.LocalTime this4312] (jti/getter minute this4312)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.LocalTime"]))} (^java.lang.Integer [^java.time.LocalTime this4313] (.hashCode this4313)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.LocalTime" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.LocalTime this4314 ^java.time.temporal.Temporal java-time-temporal-Temporal4315] (.adjustInto this4314 java-time-temporal-Temporal4315)))
(clojure.core/defn with {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalAdjuster"] ["java.time.LocalTime" "java.time.temporal.TemporalAdjuster"] ["java.time.LocalTime" "java.time.temporal.TemporalField" "long"] ["java.time.LocalTime" "java.time.temporal.TemporalField" "long"]))} (^java.lang.Object [this4316 G__4317] #? (:cljs (.with ^java.time.LocalTime this4316 G__4317) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__4317)) (clojure.core/let [G__4317 ^"java.time.temporal.TemporalAdjuster" G__4317] (.with ^java.time.LocalTime this4316 G__4317)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__4317)) (clojure.core/let [G__4317 ^"java.time.temporal.TemporalAdjuster" G__4317] (.with ^java.time.LocalTime this4316 G__4317)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this4318 G__4319 G__4320] #? (:cljs (.with ^java.time.LocalTime this4318 G__4319 G__4320) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__4319) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__4320)) (clojure.core/let [G__4319 ^"java.time.temporal.TemporalField" G__4319 G__4320 (clojure.core/long G__4320)] (.with ^java.time.LocalTime this4318 G__4319 G__4320)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__4319) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__4320)) (clojure.core/let [G__4319 ^"java.time.temporal.TemporalField" G__4319 G__4320 (clojure.core/long G__4320)] (.with ^java.time.LocalTime this4318 G__4319 G__4320)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn now {:arglists (quote (["java.time.Clock"] [] ["java.time.ZoneId"]))} (^java.time.LocalTime [G__4322] #? (:cljs (. java.time.LocalTime now G__4322) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.Clock") G__4322)) (clojure.core/let [G__4322 ^"java.time.Clock" G__4322] (. java.time.LocalTime now G__4322)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.ZoneId") G__4322)) (clojure.core/let [G__4322 ^"java.time.ZoneId" G__4322] (. java.time.LocalTime now G__4322)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.time.LocalTime [] (. java.time.LocalTime now)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.LocalTime" "java.lang.Object"] ["java.time.LocalTime" "java.time.LocalTime"]))} (^java.lang.Integer [this4323 G__4324] #? (:cljs (.compareTo ^java.time.LocalTime this4323 G__4324) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__4324)) (clojure.core/let [G__4324 ^"java.lang.Object" G__4324] (.compareTo ^java.time.LocalTime this4323 G__4324)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.LocalTime") G__4324)) (clojure.core/let [G__4324 ^"java.time.LocalTime" G__4324] (.compareTo ^java.time.LocalTime this4323 G__4324)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn to-nano-of-day {:arglists (quote (["java.time.LocalTime"]))} (^long [^java.time.LocalTime this4325] (.toNanoOfDay this4325)))
(clojure.core/defn plus-seconds {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this4326 ^long long4327] (.plusSeconds this4326 long4327)))
(clojure.core/defn get {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.LocalTime this4328 ^java.time.temporal.TemporalField java-time-temporal-TemporalField4329] (.get this4328 java-time-temporal-TemporalField4329)))
(clojure.core/defn of-second-of-day {:arglists (quote (["long"]))} (^java.time.LocalTime [^long long4330] (. java.time.LocalTime ofSecondOfDay long4330)))
(clojure.core/defn equals {:arglists (quote (["java.time.LocalTime" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.LocalTime this4331 ^java.lang.Object java-lang-Object4332] (.equals this4331 java-lang-Object4332)))
(clojure.core/defn format {:arglists (quote (["java.time.LocalTime" "java.time.format.DateTimeFormatter"]))} (^java.lang.String [^java.time.LocalTime this4333 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter4334] (.format this4333 java-time-format-DateTimeFormatter4334)))