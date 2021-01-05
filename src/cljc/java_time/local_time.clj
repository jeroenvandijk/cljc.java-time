(ns cljc.java-time.local-time (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness]) (:import [java.time LocalTime]))
(def max java.time.LocalTime/MAX)
(def noon java.time.LocalTime/NOON)
(def midnight java.time.LocalTime/MIDNIGHT)
(def min java.time.LocalTime/MIN)
(clojure.core/defn minus-minutes {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this7664 ^long long7665] (.minusMinutes this7664 long7665)))
(clojure.core/defn truncated-to {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalUnit"]))} (^java.time.LocalTime [^java.time.LocalTime this7666 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit7667] (.truncatedTo this7666 java-time-temporal-TemporalUnit7667)))
(clojure.core/defn range {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.LocalTime this7668 ^java.time.temporal.TemporalField java-time-temporal-TemporalField7669] (.range this7668 java-time-temporal-TemporalField7669)))
(clojure.core/defn get-hour {:arglists (quote (["java.time.LocalTime"]))} (^java.lang.Integer [^java.time.LocalTime this7670] (.getHour this7670)))
(clojure.core/defn at-offset {:arglists (quote (["java.time.LocalTime" "java.time.ZoneOffset"]))} (^java.time.OffsetTime [^java.time.LocalTime this7671 ^java.time.ZoneOffset java-time-ZoneOffset7672] (.atOffset this7671 java-time-ZoneOffset7672)))
(clojure.core/defn minus-hours {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this7673 ^long long7674] (.minusHours this7673 long7674)))
(clojure.core/defn of {:arglists (quote (["int" "int" "int" "int"] ["int" "int"] ["int" "int" "int"]))} (^java.time.LocalTime [^java.lang.Integer int7675 ^java.lang.Integer int7676 ^java.lang.Integer int7677 ^java.lang.Integer int7678] (java.time.LocalTime/of int7675 int7676 int7677 int7678)) (^java.time.LocalTime [^java.lang.Integer int7679 ^java.lang.Integer int7680] (java.time.LocalTime/of int7679 int7680)) (^java.time.LocalTime [^java.lang.Integer int7681 ^java.lang.Integer int7682 ^java.lang.Integer int7683] (java.time.LocalTime/of int7681 int7682 int7683)))
(clojure.core/defn get-nano {:arglists (quote (["java.time.LocalTime"]))} (^java.lang.Integer [^java.time.LocalTime this7684] (.getNano this7684)))
(clojure.core/defn minus-seconds {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this7685 ^long long7686] (.minusSeconds this7685 long7686)))
(clojure.core/defn get-second {:arglists (quote (["java.time.LocalTime"]))} (^java.lang.Integer [^java.time.LocalTime this7687] (.getSecond this7687)))
(clojure.core/defn plus-nanos {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this7688 ^long long7689] (.plusNanos this7688 long7689)))
(clojure.core/defn plus {:arglists (quote (["java.time.LocalTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalTime" "java.time.temporal.TemporalAmount"] ["java.time.LocalTime" "java.time.temporal.TemporalAmount"] ["java.time.LocalTime" "long" "java.time.temporal.TemporalUnit"]))} (^java.lang.Object [this7690 G__7691 G__7692] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__7691) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__7692)) (clojure.core/let [G__7691 (clojure.core/long G__7691) G__7692 ^"java.time.temporal.TemporalUnit" G__7692] (.plus ^java.time.LocalTime this7690 G__7691 G__7692)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__7691) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__7692)) (clojure.core/let [G__7691 (clojure.core/long G__7691) G__7692 ^"java.time.temporal.TemporalUnit" G__7692] (.plus ^java.time.LocalTime this7690 G__7691 G__7692)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))) (^java.lang.Object [this7693 G__7694] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__7694)) (clojure.core/let [G__7694 ^"java.time.temporal.TemporalAmount" G__7694] (.plus ^java.time.LocalTime this7693 G__7694)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__7694)) (clojure.core/let [G__7694 ^"java.time.temporal.TemporalAmount" G__7694] (.plus ^java.time.LocalTime this7693 G__7694)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn with-hour {:arglists (quote (["java.time.LocalTime" "int"]))} (^java.time.LocalTime [^java.time.LocalTime this7695 ^java.lang.Integer int7696] (.withHour this7695 int7696)))
(clojure.core/defn with-minute {:arglists (quote (["java.time.LocalTime" "int"]))} (^java.time.LocalTime [^java.time.LocalTime this7697 ^java.lang.Integer int7698] (.withMinute this7697 int7698)))
(clojure.core/defn plus-minutes {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this7699 ^long long7700] (.plusMinutes this7699 long7700)))
(clojure.core/defn query {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.LocalTime this7701 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery7702] (.query this7701 java-time-temporal-TemporalQuery7702)))
(clojure.core/defn at-date {:arglists (quote (["java.time.LocalTime" "java.time.LocalDate"]))} (^java.time.LocalDateTime [^java.time.LocalTime this7703 ^java.time.LocalDate java-time-LocalDate7704] (.atDate this7703 java-time-LocalDate7704)))
(clojure.core/defn to-string {:arglists (quote (["java.time.LocalTime"]))} (^java.lang.String [^java.time.LocalTime this7705] (.toString this7705)))
(clojure.core/defn is-before {:arglists (quote (["java.time.LocalTime" "java.time.LocalTime"]))} (^java.lang.Boolean [^java.time.LocalTime this7706 ^java.time.LocalTime java-time-LocalTime7707] (.isBefore this7706 java-time-LocalTime7707)))
(clojure.core/defn minus {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalAmount"] ["java.time.LocalTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalTime" "java.time.temporal.TemporalAmount"] ["java.time.LocalTime" "long" "java.time.temporal.TemporalUnit"]))} (^java.lang.Object [this7708 G__7709] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__7709)) (clojure.core/let [G__7709 ^"java.time.temporal.TemporalAmount" G__7709] (.minus ^java.time.LocalTime this7708 G__7709)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__7709)) (clojure.core/let [G__7709 ^"java.time.temporal.TemporalAmount" G__7709] (.minus ^java.time.LocalTime this7708 G__7709)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))) (^java.lang.Object [this7710 G__7711 G__7712] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__7711) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__7712)) (clojure.core/let [G__7711 (clojure.core/long G__7711) G__7712 ^"java.time.temporal.TemporalUnit" G__7712] (.minus ^java.time.LocalTime this7710 G__7711 G__7712)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__7711) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__7712)) (clojure.core/let [G__7711 (clojure.core/long G__7711) G__7712 ^"java.time.temporal.TemporalUnit" G__7712] (.minus ^java.time.LocalTime this7710 G__7711 G__7712)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn plus-hours {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this7713 ^long long7714] (.plusHours this7713 long7714)))
(clojure.core/defn to-second-of-day {:arglists (quote (["java.time.LocalTime"]))} (^java.lang.Integer [^java.time.LocalTime this7715] (.toSecondOfDay this7715)))
(clojure.core/defn get-long {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalField"]))} (^long [^java.time.LocalTime this7716 ^java.time.temporal.TemporalField java-time-temporal-TemporalField7717] (.getLong this7716 java-time-temporal-TemporalField7717)))
(clojure.core/defn with-nano {:arglists (quote (["java.time.LocalTime" "int"]))} (^java.time.LocalTime [^java.time.LocalTime this7718 ^java.lang.Integer int7719] (.withNano this7718 int7719)))
(clojure.core/defn until {:arglists (quote (["java.time.LocalTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))} (^long [^java.time.LocalTime this7720 ^java.time.temporal.Temporal java-time-temporal-Temporal7721 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit7722] (.until this7720 java-time-temporal-Temporal7721 java-time-temporal-TemporalUnit7722)))
(clojure.core/defn of-nano-of-day {:arglists (quote (["long"]))} (^java.time.LocalTime [^long long7723] (java.time.LocalTime/ofNanoOfDay long7723)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.LocalTime [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor7724] (java.time.LocalTime/from java-time-temporal-TemporalAccessor7724)))
(clojure.core/defn is-after {:arglists (quote (["java.time.LocalTime" "java.time.LocalTime"]))} (^java.lang.Boolean [^java.time.LocalTime this7725 ^java.time.LocalTime java-time-LocalTime7726] (.isAfter this7725 java-time-LocalTime7726)))
(clojure.core/defn minus-nanos {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this7727 ^long long7728] (.minusNanos this7727 long7728)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalUnit"] ["java.time.LocalTime" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [this7729 G__7730] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__7730)) (clojure.core/let [G__7730 ^"java.time.temporal.TemporalUnit" G__7730] (.isSupported ^java.time.LocalTime this7729 G__7730)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__7730)) (clojure.core/let [G__7730 ^"java.time.temporal.TemporalField" G__7730] (.isSupported ^java.time.LocalTime this7729 G__7730)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence" "java.time.format.DateTimeFormatter"] ["java.lang.CharSequence"]))} (^java.time.LocalTime [^java.lang.CharSequence java-lang-CharSequence7731 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter7732] (java.time.LocalTime/parse java-lang-CharSequence7731 java-time-format-DateTimeFormatter7732)) (^java.time.LocalTime [^java.lang.CharSequence java-lang-CharSequence7733] (java.time.LocalTime/parse java-lang-CharSequence7733)))
(clojure.core/defn with-second {:arglists (quote (["java.time.LocalTime" "int"]))} (^java.time.LocalTime [^java.time.LocalTime this7734 ^java.lang.Integer int7735] (.withSecond this7734 int7735)))
(clojure.core/defn get-minute {:arglists (quote (["java.time.LocalTime"]))} (^java.lang.Integer [^java.time.LocalTime this7736] (.getMinute this7736)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.LocalTime"]))} (^java.lang.Integer [^java.time.LocalTime this7737] (.hashCode this7737)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.LocalTime" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.LocalTime this7738 ^java.time.temporal.Temporal java-time-temporal-Temporal7739] (.adjustInto this7738 java-time-temporal-Temporal7739)))
(clojure.core/defn with {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalAdjuster"] ["java.time.LocalTime" "java.time.temporal.TemporalField" "long"] ["java.time.LocalTime" "java.time.temporal.TemporalField" "long"] ["java.time.LocalTime" "java.time.temporal.TemporalAdjuster"]))} (^java.lang.Object [this7740 G__7741] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__7741)) (clojure.core/let [G__7741 ^"java.time.temporal.TemporalAdjuster" G__7741] (.with ^java.time.LocalTime this7740 G__7741)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__7741)) (clojure.core/let [G__7741 ^"java.time.temporal.TemporalAdjuster" G__7741] (.with ^java.time.LocalTime this7740 G__7741)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))) (^java.lang.Object [this7742 G__7743 G__7744] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__7743) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__7744)) (clojure.core/let [G__7743 ^"java.time.temporal.TemporalField" G__7743 G__7744 (clojure.core/long G__7744)] (.with ^java.time.LocalTime this7742 G__7743 G__7744)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__7743) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__7744)) (clojure.core/let [G__7743 ^"java.time.temporal.TemporalField" G__7743 G__7744 (clojure.core/long G__7744)] (.with ^java.time.LocalTime this7742 G__7743 G__7744)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn now {:arglists (quote (["java.time.Clock"] ["java.time.ZoneId"] []))} (^java.time.LocalTime [G__7746] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.Clock") G__7746)) (clojure.core/let [G__7746 ^"java.time.Clock" G__7746] (java.time.LocalTime/now G__7746)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.ZoneId") G__7746)) (clojure.core/let [G__7746 ^"java.time.ZoneId" G__7746] (java.time.LocalTime/now G__7746)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))) (^java.time.LocalTime [] (java.time.LocalTime/now)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.LocalTime" "java.lang.Object"] ["java.time.LocalTime" "java.time.LocalTime"]))} (^java.lang.Integer [this7747 G__7748] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__7748)) (clojure.core/let [G__7748 ^"java.lang.Object" G__7748] (.compareTo ^java.time.LocalTime this7747 G__7748)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.LocalTime") G__7748)) (clojure.core/let [G__7748 ^"java.time.LocalTime" G__7748] (.compareTo ^java.time.LocalTime this7747 G__7748)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn to-nano-of-day {:arglists (quote (["java.time.LocalTime"]))} (^long [^java.time.LocalTime this7749] (.toNanoOfDay this7749)))
(clojure.core/defn plus-seconds {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this7750 ^long long7751] (.plusSeconds this7750 long7751)))
(clojure.core/defn get {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.LocalTime this7752 ^java.time.temporal.TemporalField java-time-temporal-TemporalField7753] (.get this7752 java-time-temporal-TemporalField7753)))
(clojure.core/defn of-second-of-day {:arglists (quote (["long"]))} (^java.time.LocalTime [^long long7754] (java.time.LocalTime/ofSecondOfDay long7754)))
(clojure.core/defn equals {:arglists (quote (["java.time.LocalTime" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.LocalTime this7755 ^java.lang.Object java-lang-Object7756] (.equals this7755 java-lang-Object7756)))
(clojure.core/defn format {:arglists (quote (["java.time.LocalTime" "java.time.format.DateTimeFormatter"]))} (^java.lang.String [^java.time.LocalTime this7757 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter7758] (.format this7757 java-time-format-DateTimeFormatter7758)))
