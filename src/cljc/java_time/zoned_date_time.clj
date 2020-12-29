(ns cljc.java-time.zoned-date-time (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness]) (:import [java.time ZonedDateTime]))
(clojure.core/defn minus-minutes {:arglists (quote (["java.time.ZonedDateTime" "long"]))} (^java.time.ZonedDateTime [^java.time.ZonedDateTime this59372 ^long long59373] (.minusMinutes this59372 long59373)))
(clojure.core/defn truncated-to {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalUnit"]))} (^java.time.ZonedDateTime [^java.time.ZonedDateTime this59374 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit59375] (.truncatedTo this59374 java-time-temporal-TemporalUnit59375)))
(clojure.core/defn minus-weeks {:arglists (quote (["java.time.ZonedDateTime" "long"]))} (^java.time.ZonedDateTime [^java.time.ZonedDateTime this59376 ^long long59377] (.minusWeeks this59376 long59377)))
(clojure.core/defn to-instant {:arglists (quote (["java.time.ZonedDateTime"]))} (^java.time.Instant [^java.time.ZonedDateTime this59378] (.toInstant this59378)))
(clojure.core/defn plus-weeks {:arglists (quote (["java.time.ZonedDateTime" "long"]))} (^java.time.ZonedDateTime [^java.time.ZonedDateTime this59379 ^long long59380] (.plusWeeks this59379 long59380)))
(clojure.core/defn range {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.ZonedDateTime this59381 ^java.time.temporal.TemporalField java-time-temporal-TemporalField59382] (.range this59381 java-time-temporal-TemporalField59382)))
(clojure.core/defn with-earlier-offset-at-overlap {:arglists (quote (["java.time.ZonedDateTime"] ["java.time.ZonedDateTime"]))} (^java.lang.Object [this59383] (clojure.core/cond (clojure.core/and) (clojure.core/let [] (.withEarlierOffsetAtOverlap ^java.time.ZonedDateTime this59383)) (clojure.core/and) (clojure.core/let [] (.withEarlierOffsetAtOverlap ^java.time.ZonedDateTime this59383)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn get-hour {:arglists (quote (["java.time.ZonedDateTime"]))} (^java.lang.Integer [^java.time.ZonedDateTime this59384] (.getHour this59384)))
(clojure.core/defn minus-hours {:arglists (quote (["java.time.ZonedDateTime" "long"]))} (^java.time.ZonedDateTime [^java.time.ZonedDateTime this59385 ^long long59386] (.minusHours this59385 long59386)))
(clojure.core/defn of {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneId"] ["java.time.LocalDate" "java.time.LocalTime" "java.time.ZoneId"] ["int" "int" "int" "int" "int" "int" "int" "java.time.ZoneId"]))} (^java.time.ZonedDateTime [^java.time.LocalDateTime java-time-LocalDateTime59387 ^java.time.ZoneId java-time-ZoneId59388] (java.time.ZonedDateTime/of java-time-LocalDateTime59387 java-time-ZoneId59388)) (^java.time.ZonedDateTime [^java.time.LocalDate java-time-LocalDate59389 ^java.time.LocalTime java-time-LocalTime59390 ^java.time.ZoneId java-time-ZoneId59391] (java.time.ZonedDateTime/of java-time-LocalDate59389 java-time-LocalTime59390 java-time-ZoneId59391)) (^java.time.ZonedDateTime [^java.lang.Integer int59392 ^java.lang.Integer int59393 ^java.lang.Integer int59394 ^java.lang.Integer int59395 ^java.lang.Integer int59396 ^java.lang.Integer int59397 ^java.lang.Integer int59398 ^java.time.ZoneId java-time-ZoneId59399] (java.time.ZonedDateTime/of int59392 int59393 int59394 int59395 int59396 int59397 int59398 java-time-ZoneId59399)))
(clojure.core/defn with-month {:arglists (quote (["java.time.ZonedDateTime" "int"]))} (^java.time.ZonedDateTime [^java.time.ZonedDateTime this59400 ^java.lang.Integer int59401] (.withMonth this59400 int59401)))
(clojure.core/defn is-equal {:arglists (quote (["java.time.ZonedDateTime" "java.time.chrono.ChronoZonedDateTime"]))} (^java.lang.Boolean [^java.time.ZonedDateTime this59402 ^java.time.chrono.ChronoZonedDateTime java-time-chrono-ChronoZonedDateTime59403] (.isEqual this59402 java-time-chrono-ChronoZonedDateTime59403)))
(clojure.core/defn get-nano {:arglists (quote (["java.time.ZonedDateTime"]))} (^java.lang.Integer [^java.time.ZonedDateTime this59404] (.getNano this59404)))
(clojure.core/defn of-local {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneId" "java.time.ZoneOffset"]))} (^java.time.ZonedDateTime [^java.time.LocalDateTime java-time-LocalDateTime59405 ^java.time.ZoneId java-time-ZoneId59406 ^java.time.ZoneOffset java-time-ZoneOffset59407] (java.time.ZonedDateTime/ofLocal java-time-LocalDateTime59405 java-time-ZoneId59406 java-time-ZoneOffset59407)))
(clojure.core/defn get-year {:arglists (quote (["java.time.ZonedDateTime"]))} (^java.lang.Integer [^java.time.ZonedDateTime this59408] (.getYear this59408)))
(clojure.core/defn minus-seconds {:arglists (quote (["java.time.ZonedDateTime" "long"]))} (^java.time.ZonedDateTime [^java.time.ZonedDateTime this59409 ^long long59410] (.minusSeconds this59409 long59410)))
(clojure.core/defn get-second {:arglists (quote (["java.time.ZonedDateTime"]))} (^java.lang.Integer [^java.time.ZonedDateTime this59411] (.getSecond this59411)))
(clojure.core/defn plus-nanos {:arglists (quote (["java.time.ZonedDateTime" "long"]))} (^java.time.ZonedDateTime [^java.time.ZonedDateTime this59412 ^long long59413] (.plusNanos this59412 long59413)))
(clojure.core/defn get-day-of-year {:arglists (quote (["java.time.ZonedDateTime"]))} (^java.lang.Integer [^java.time.ZonedDateTime this59414] (.getDayOfYear this59414)))
(clojure.core/defn plus {:arglists (quote (["java.time.ZonedDateTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.ZonedDateTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.ZonedDateTime" "java.time.temporal.TemporalAmount"] ["java.time.ZonedDateTime" "java.time.temporal.TemporalAmount"] ["java.time.ZonedDateTime" "java.time.temporal.TemporalAmount"] ["java.time.ZonedDateTime" "long" "java.time.temporal.TemporalUnit"]))} (^java.lang.Object [this59415 G__59416 G__59417] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__59416) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__59417)) (clojure.core/let [G__59416 (clojure.core/long G__59416) G__59417 ^"java.time.temporal.TemporalUnit" G__59417] (.plus ^java.time.ZonedDateTime this59415 G__59416 G__59417)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__59416) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__59417)) (clojure.core/let [G__59416 (clojure.core/long G__59416) G__59417 ^"java.time.temporal.TemporalUnit" G__59417] (.plus ^java.time.ZonedDateTime this59415 G__59416 G__59417)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__59416) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__59417)) (clojure.core/let [G__59416 (clojure.core/long G__59416) G__59417 ^"java.time.temporal.TemporalUnit" G__59417] (.plus ^java.time.ZonedDateTime this59415 G__59416 G__59417)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))) (^java.lang.Object [this59418 G__59419] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__59419)) (clojure.core/let [G__59419 ^"java.time.temporal.TemporalAmount" G__59419] (.plus ^java.time.ZonedDateTime this59418 G__59419)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__59419)) (clojure.core/let [G__59419 ^"java.time.temporal.TemporalAmount" G__59419] (.plus ^java.time.ZonedDateTime this59418 G__59419)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__59419)) (clojure.core/let [G__59419 ^"java.time.temporal.TemporalAmount" G__59419] (.plus ^java.time.ZonedDateTime this59418 G__59419)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn with-hour {:arglists (quote (["java.time.ZonedDateTime" "int"]))} (^java.time.ZonedDateTime [^java.time.ZonedDateTime this59420 ^java.lang.Integer int59421] (.withHour this59420 int59421)))
(clojure.core/defn with-minute {:arglists (quote (["java.time.ZonedDateTime" "int"]))} (^java.time.ZonedDateTime [^java.time.ZonedDateTime this59422 ^java.lang.Integer int59423] (.withMinute this59422 int59423)))
(clojure.core/defn plus-minutes {:arglists (quote (["java.time.ZonedDateTime" "long"]))} (^java.time.ZonedDateTime [^java.time.ZonedDateTime this59424 ^long long59425] (.plusMinutes this59424 long59425)))
(clojure.core/defn query {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.ZonedDateTime this59426 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery59427] (.query this59426 java-time-temporal-TemporalQuery59427)))
(clojure.core/defn get-day-of-week {:arglists (quote (["java.time.ZonedDateTime"]))} (^java.time.DayOfWeek [^java.time.ZonedDateTime this59428] (.getDayOfWeek this59428)))
(clojure.core/defn to-string {:arglists (quote (["java.time.ZonedDateTime"]))} (^java.lang.String [^java.time.ZonedDateTime this59429] (.toString this59429)))
(clojure.core/defn plus-months {:arglists (quote (["java.time.ZonedDateTime" "long"]))} (^java.time.ZonedDateTime [^java.time.ZonedDateTime this59430 ^long long59431] (.plusMonths this59430 long59431)))
(clojure.core/defn is-before {:arglists (quote (["java.time.ZonedDateTime" "java.time.chrono.ChronoZonedDateTime"]))} (^java.lang.Boolean [^java.time.ZonedDateTime this59432 ^java.time.chrono.ChronoZonedDateTime java-time-chrono-ChronoZonedDateTime59433] (.isBefore this59432 java-time-chrono-ChronoZonedDateTime59433)))
(clojure.core/defn minus-months {:arglists (quote (["java.time.ZonedDateTime" "long"]))} (^java.time.ZonedDateTime [^java.time.ZonedDateTime this59434 ^long long59435] (.minusMonths this59434 long59435)))
(clojure.core/defn minus {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalAmount"] ["java.time.ZonedDateTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.ZonedDateTime" "java.time.temporal.TemporalAmount"] ["java.time.ZonedDateTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.ZonedDateTime" "java.time.temporal.TemporalAmount"] ["java.time.ZonedDateTime" "long" "java.time.temporal.TemporalUnit"]))} (^java.lang.Object [this59436 G__59437] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__59437)) (clojure.core/let [G__59437 ^"java.time.temporal.TemporalAmount" G__59437] (.minus ^java.time.ZonedDateTime this59436 G__59437)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__59437)) (clojure.core/let [G__59437 ^"java.time.temporal.TemporalAmount" G__59437] (.minus ^java.time.ZonedDateTime this59436 G__59437)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__59437)) (clojure.core/let [G__59437 ^"java.time.temporal.TemporalAmount" G__59437] (.minus ^java.time.ZonedDateTime this59436 G__59437)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))) (^java.lang.Object [this59438 G__59439 G__59440] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__59439) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__59440)) (clojure.core/let [G__59439 (clojure.core/long G__59439) G__59440 ^"java.time.temporal.TemporalUnit" G__59440] (.minus ^java.time.ZonedDateTime this59438 G__59439 G__59440)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__59439) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__59440)) (clojure.core/let [G__59439 (clojure.core/long G__59439) G__59440 ^"java.time.temporal.TemporalUnit" G__59440] (.minus ^java.time.ZonedDateTime this59438 G__59439 G__59440)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__59439) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__59440)) (clojure.core/let [G__59439 (clojure.core/long G__59439) G__59440 ^"java.time.temporal.TemporalUnit" G__59440] (.minus ^java.time.ZonedDateTime this59438 G__59439 G__59440)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn with-fixed-offset-zone {:arglists (quote (["java.time.ZonedDateTime"]))} (^java.time.ZonedDateTime [^java.time.ZonedDateTime this59441] (.withFixedOffsetZone this59441)))
(clojure.core/defn plus-hours {:arglists (quote (["java.time.ZonedDateTime" "long"]))} (^java.time.ZonedDateTime [^java.time.ZonedDateTime this59442 ^long long59443] (.plusHours this59442 long59443)))
(clojure.core/defn with-zone-same-local {:arglists (quote (["java.time.ZonedDateTime" "java.time.ZoneId"] ["java.time.ZonedDateTime" "java.time.ZoneId"]))} (^java.lang.Object [this59444 G__59445] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.ZoneId") G__59445)) (clojure.core/let [G__59445 ^"java.time.ZoneId" G__59445] (.withZoneSameLocal ^java.time.ZonedDateTime this59444 G__59445)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.ZoneId") G__59445)) (clojure.core/let [G__59445 ^"java.time.ZoneId" G__59445] (.withZoneSameLocal ^java.time.ZonedDateTime this59444 G__59445)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn with-zone-same-instant {:arglists (quote (["java.time.ZonedDateTime" "java.time.ZoneId"] ["java.time.ZonedDateTime" "java.time.ZoneId"]))} (^java.lang.Object [this59446 G__59447] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.ZoneId") G__59447)) (clojure.core/let [G__59447 ^"java.time.ZoneId" G__59447] (.withZoneSameInstant ^java.time.ZonedDateTime this59446 G__59447)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.ZoneId") G__59447)) (clojure.core/let [G__59447 ^"java.time.ZoneId" G__59447] (.withZoneSameInstant ^java.time.ZonedDateTime this59446 G__59447)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn plus-days {:arglists (quote (["java.time.ZonedDateTime" "long"]))} (^java.time.ZonedDateTime [^java.time.ZonedDateTime this59448 ^long long59449] (.plusDays this59448 long59449)))
(clojure.core/defn to-local-time {:arglists (quote (["java.time.ZonedDateTime"]))} (^java.time.LocalTime [^java.time.ZonedDateTime this59450] (.toLocalTime this59450)))
(clojure.core/defn get-long {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalField"]))} (^long [^java.time.ZonedDateTime this59451 ^java.time.temporal.TemporalField java-time-temporal-TemporalField59452] (.getLong this59451 java-time-temporal-TemporalField59452)))
(clojure.core/defn get-offset {:arglists (quote (["java.time.ZonedDateTime"]))} (^java.time.ZoneOffset [^java.time.ZonedDateTime this59453] (.getOffset this59453)))
(clojure.core/defn with-year {:arglists (quote (["java.time.ZonedDateTime" "int"]))} (^java.time.ZonedDateTime [^java.time.ZonedDateTime this59454 ^java.lang.Integer int59455] (.withYear this59454 int59455)))
(clojure.core/defn with-nano {:arglists (quote (["java.time.ZonedDateTime" "int"]))} (^java.time.ZonedDateTime [^java.time.ZonedDateTime this59456 ^java.lang.Integer int59457] (.withNano this59456 int59457)))
(clojure.core/defn to-epoch-second {:arglists (quote (["java.time.ZonedDateTime"]))} (^long [^java.time.ZonedDateTime this59458] (.toEpochSecond this59458)))
(clojure.core/defn to-offset-date-time {:arglists (quote (["java.time.ZonedDateTime"]))} (^java.time.OffsetDateTime [^java.time.ZonedDateTime this59459] (.toOffsetDateTime this59459)))
(clojure.core/defn with-later-offset-at-overlap {:arglists (quote (["java.time.ZonedDateTime"] ["java.time.ZonedDateTime"]))} (^java.lang.Object [this59460] (clojure.core/cond (clojure.core/and) (clojure.core/let [] (.withLaterOffsetAtOverlap ^java.time.ZonedDateTime this59460)) (clojure.core/and) (clojure.core/let [] (.withLaterOffsetAtOverlap ^java.time.ZonedDateTime this59460)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn until {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))} (^long [^java.time.ZonedDateTime this59461 ^java.time.temporal.Temporal java-time-temporal-Temporal59462 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit59463] (.until this59461 java-time-temporal-Temporal59462 java-time-temporal-TemporalUnit59463)))
(clojure.core/defn get-zone {:arglists (quote (["java.time.ZonedDateTime"]))} (^java.time.ZoneId [^java.time.ZonedDateTime this59464] (.getZone this59464)))
(clojure.core/defn with-day-of-month {:arglists (quote (["java.time.ZonedDateTime" "int"]))} (^java.time.ZonedDateTime [^java.time.ZonedDateTime this59465 ^java.lang.Integer int59466] (.withDayOfMonth this59465 int59466)))
(clojure.core/defn get-day-of-month {:arglists (quote (["java.time.ZonedDateTime"]))} (^java.lang.Integer [^java.time.ZonedDateTime this59467] (.getDayOfMonth this59467)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.ZonedDateTime [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor59468] (java.time.ZonedDateTime/from java-time-temporal-TemporalAccessor59468)))
(clojure.core/defn is-after {:arglists (quote (["java.time.ZonedDateTime" "java.time.chrono.ChronoZonedDateTime"]))} (^java.lang.Boolean [^java.time.ZonedDateTime this59469 ^java.time.chrono.ChronoZonedDateTime java-time-chrono-ChronoZonedDateTime59470] (.isAfter this59469 java-time-chrono-ChronoZonedDateTime59470)))
(clojure.core/defn minus-nanos {:arglists (quote (["java.time.ZonedDateTime" "long"]))} (^java.time.ZonedDateTime [^java.time.ZonedDateTime this59471 ^long long59472] (.minusNanos this59471 long59472)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalUnit"] ["java.time.ZonedDateTime" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [this59473 G__59474] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__59474)) (clojure.core/let [G__59474 ^"java.time.temporal.TemporalUnit" G__59474] (.isSupported ^java.time.ZonedDateTime this59473 G__59474)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__59474)) (clojure.core/let [G__59474 ^"java.time.temporal.TemporalField" G__59474] (.isSupported ^java.time.ZonedDateTime this59473 G__59474)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn minus-years {:arglists (quote (["java.time.ZonedDateTime" "long"]))} (^java.time.ZonedDateTime [^java.time.ZonedDateTime this59475 ^long long59476] (.minusYears this59475 long59476)))
(clojure.core/defn get-chronology {:arglists (quote (["java.time.ZonedDateTime"]))} (^java.time.chrono.Chronology [^java.time.ZonedDateTime this59477] (.getChronology this59477)))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))} (^java.time.ZonedDateTime [^java.lang.CharSequence java-lang-CharSequence59478] (java.time.ZonedDateTime/parse java-lang-CharSequence59478)) (^java.time.ZonedDateTime [^java.lang.CharSequence java-lang-CharSequence59479 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter59480] (java.time.ZonedDateTime/parse java-lang-CharSequence59479 java-time-format-DateTimeFormatter59480)))
(clojure.core/defn with-second {:arglists (quote (["java.time.ZonedDateTime" "int"]))} (^java.time.ZonedDateTime [^java.time.ZonedDateTime this59481 ^java.lang.Integer int59482] (.withSecond this59481 int59482)))
(clojure.core/defn to-local-date {:arglists (quote (["java.time.ZonedDateTime"] ["java.time.ZonedDateTime"]))} (^java.lang.Object [this59483] (clojure.core/cond (clojure.core/and) (clojure.core/let [] (.toLocalDate ^java.time.ZonedDateTime this59483)) (clojure.core/and) (clojure.core/let [] (.toLocalDate ^java.time.ZonedDateTime this59483)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn get-minute {:arglists (quote (["java.time.ZonedDateTime"]))} (^java.lang.Integer [^java.time.ZonedDateTime this59484] (.getMinute this59484)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.ZonedDateTime"]))} (^java.lang.Integer [^java.time.ZonedDateTime this59485] (.hashCode this59485)))
(clojure.core/defn with {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalField" "long"] ["java.time.ZonedDateTime" "java.time.temporal.TemporalAdjuster"] ["java.time.ZonedDateTime" "java.time.temporal.TemporalField" "long"] ["java.time.ZonedDateTime" "java.time.temporal.TemporalAdjuster"] ["java.time.ZonedDateTime" "java.time.temporal.TemporalField" "long"] ["java.time.ZonedDateTime" "java.time.temporal.TemporalAdjuster"]))} (^java.lang.Object [this59486 G__59487 G__59488] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__59487) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__59488)) (clojure.core/let [G__59487 ^"java.time.temporal.TemporalField" G__59487 G__59488 (clojure.core/long G__59488)] (.with ^java.time.ZonedDateTime this59486 G__59487 G__59488)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__59487) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__59488)) (clojure.core/let [G__59487 ^"java.time.temporal.TemporalField" G__59487 G__59488 (clojure.core/long G__59488)] (.with ^java.time.ZonedDateTime this59486 G__59487 G__59488)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__59487) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__59488)) (clojure.core/let [G__59487 ^"java.time.temporal.TemporalField" G__59487 G__59488 (clojure.core/long G__59488)] (.with ^java.time.ZonedDateTime this59486 G__59487 G__59488)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))) (^java.lang.Object [this59489 G__59490] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__59490)) (clojure.core/let [G__59490 ^"java.time.temporal.TemporalAdjuster" G__59490] (.with ^java.time.ZonedDateTime this59489 G__59490)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__59490)) (clojure.core/let [G__59490 ^"java.time.temporal.TemporalAdjuster" G__59490] (.with ^java.time.ZonedDateTime this59489 G__59490)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__59490)) (clojure.core/let [G__59490 ^"java.time.temporal.TemporalAdjuster" G__59490] (.with ^java.time.ZonedDateTime this59489 G__59490)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn now {:arglists (quote (["java.time.Clock"] [] ["java.time.ZoneId"]))} (^java.time.ZonedDateTime [G__59492] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.Clock") G__59492)) (clojure.core/let [G__59492 ^"java.time.Clock" G__59492] (java.time.ZonedDateTime/now G__59492)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.ZoneId") G__59492)) (clojure.core/let [G__59492 ^"java.time.ZoneId" G__59492] (java.time.ZonedDateTime/now G__59492)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))) (^java.time.ZonedDateTime [] (java.time.ZonedDateTime/now)))
(clojure.core/defn to-local-date-time {:arglists (quote (["java.time.ZonedDateTime"] ["java.time.ZonedDateTime"]))} (^java.lang.Object [this59493] (clojure.core/cond (clojure.core/and) (clojure.core/let [] (.toLocalDateTime ^java.time.ZonedDateTime this59493)) (clojure.core/and) (clojure.core/let [] (.toLocalDateTime ^java.time.ZonedDateTime this59493)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn get-month-value {:arglists (quote (["java.time.ZonedDateTime"]))} (^java.lang.Integer [^java.time.ZonedDateTime this59494] (.getMonthValue this59494)))
(clojure.core/defn with-day-of-year {:arglists (quote (["java.time.ZonedDateTime" "int"]))} (^java.time.ZonedDateTime [^java.time.ZonedDateTime this59495 ^java.lang.Integer int59496] (.withDayOfYear this59495 int59496)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.ZonedDateTime" "java.lang.Object"] ["java.time.ZonedDateTime" "java.time.chrono.ChronoZonedDateTime"]))} (^java.lang.Integer [this59497 G__59498] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__59498)) (clojure.core/let [G__59498 ^"java.lang.Object" G__59498] (.compareTo ^java.time.ZonedDateTime this59497 G__59498)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.chrono.ChronoZonedDateTime") G__59498)) (clojure.core/let [G__59498 ^"java.time.chrono.ChronoZonedDateTime" G__59498] (.compareTo ^java.time.ZonedDateTime this59497 G__59498)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn of-strict {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneOffset" "java.time.ZoneId"]))} (^java.time.ZonedDateTime [^java.time.LocalDateTime java-time-LocalDateTime59499 ^java.time.ZoneOffset java-time-ZoneOffset59500 ^java.time.ZoneId java-time-ZoneId59501] (java.time.ZonedDateTime/ofStrict java-time-LocalDateTime59499 java-time-ZoneOffset59500 java-time-ZoneId59501)))
(clojure.core/defn get-month {:arglists (quote (["java.time.ZonedDateTime"]))} (^java.time.Month [^java.time.ZonedDateTime this59502] (.getMonth this59502)))
(clojure.core/defn of-instant {:arglists (quote (["java.time.Instant" "java.time.ZoneId"] ["java.time.LocalDateTime" "java.time.ZoneOffset" "java.time.ZoneId"]))} (^java.time.ZonedDateTime [^java.time.Instant java-time-Instant59503 ^java.time.ZoneId java-time-ZoneId59504] (java.time.ZonedDateTime/ofInstant java-time-Instant59503 java-time-ZoneId59504)) (^java.time.ZonedDateTime [^java.time.LocalDateTime java-time-LocalDateTime59505 ^java.time.ZoneOffset java-time-ZoneOffset59506 ^java.time.ZoneId java-time-ZoneId59507] (java.time.ZonedDateTime/ofInstant java-time-LocalDateTime59505 java-time-ZoneOffset59506 java-time-ZoneId59507)))
(clojure.core/defn plus-seconds {:arglists (quote (["java.time.ZonedDateTime" "long"]))} (^java.time.ZonedDateTime [^java.time.ZonedDateTime this59508 ^long long59509] (.plusSeconds this59508 long59509)))
(clojure.core/defn get {:arglists (quote (["java.time.ZonedDateTime" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.ZonedDateTime this59510 ^java.time.temporal.TemporalField java-time-temporal-TemporalField59511] (.get this59510 java-time-temporal-TemporalField59511)))
(clojure.core/defn equals {:arglists (quote (["java.time.ZonedDateTime" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.ZonedDateTime this59512 ^java.lang.Object java-lang-Object59513] (.equals this59512 java-lang-Object59513)))
(clojure.core/defn format {:arglists (quote (["java.time.ZonedDateTime" "java.time.format.DateTimeFormatter"]))} (^java.lang.String [^java.time.ZonedDateTime this59514 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter59515] (.format this59514 java-time-format-DateTimeFormatter59515)))
(clojure.core/defn plus-years {:arglists (quote (["java.time.ZonedDateTime" "long"]))} (^java.time.ZonedDateTime [^java.time.ZonedDateTime this59516 ^long long59517] (.plusYears this59516 long59517)))
(clojure.core/defn minus-days {:arglists (quote (["java.time.ZonedDateTime" "long"]))} (^java.time.ZonedDateTime [^java.time.ZonedDateTime this59518 ^long long59519] (.minusDays this59518 long59519)))
