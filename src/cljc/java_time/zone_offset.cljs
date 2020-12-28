(ns cljc.java-time.zone-offset (:require [java.time :refer [ZoneOffset]]) (:refer-clojure :exclude [get range format min max next name resolve short]))
(def max (. java.time.ZoneOffset -MAX))
(def min (. java.time.ZoneOffset -MIN))
(def utc (. java.time.ZoneOffset -UTC))
(clojure.core/defn get-available-zone-ids {:arglists (quote ([]))} (^java.util.Set [] (. java.time.ZoneOffset getAvailableZoneIds)))
(clojure.core/defn range {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.ZoneOffset this50761 ^java.time.temporal.TemporalField java-time-temporal-TemporalField50762] (.range this50761 java-time-temporal-TemporalField50762)))
(clojure.core/defn of-total-seconds {:arglists (quote (["int"]))} (^java.time.ZoneOffset [^java.lang.Integer int50763] (. java.time.ZoneOffset ofTotalSeconds int50763)))
(clojure.core/defn of {:arglists (quote (["java.lang.String"] ["java.lang.String"] ["java.lang.String" "java.util.Map"]))} (^java.lang.Object [G__50765] (. java.time.ZoneOffset of G__50765)) (^java.time.ZoneId [^java.lang.String java-lang-String50766 ^java.util.Map java-util-Map50767] (. java.time.ZoneOffset of java-lang-String50766 java-util-Map50767)))
(clojure.core/defn of-offset {:arglists (quote (["java.lang.String" "java.time.ZoneOffset"]))} (^java.time.ZoneId [^java.lang.String java-lang-String50768 ^java.time.ZoneOffset java-time-ZoneOffset50769] (. java.time.ZoneOffset ofOffset java-lang-String50768 java-time-ZoneOffset50769)))
(clojure.core/defn query {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.ZoneOffset this50770 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery50771] (.query this50770 java-time-temporal-TemporalQuery50771)))
(clojure.core/defn to-string {:arglists (quote (["java.time.ZoneOffset"]))} (^java.lang.String [^java.time.ZoneOffset this50772] (.toString this50772)))
(clojure.core/defn get-display-name {:arglists (quote (["java.time.ZoneOffset" "java.time.format.TextStyle" "java.util.Locale"]))} (^java.lang.String [^java.time.ZoneOffset this50773 ^java.time.format.TextStyle java-time-format-TextStyle50774 ^java.util.Locale java-util-Locale50775] (.displayName this50773 java-time-format-TextStyle50774 java-util-Locale50775)))
(clojure.core/defn get-long {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.TemporalField"]))} (^long [^java.time.ZoneOffset this50776 ^java.time.temporal.TemporalField java-time-temporal-TemporalField50777] (.getLong this50776 java-time-temporal-TemporalField50777)))
(clojure.core/defn get-rules {:arglists (quote (["java.time.ZoneOffset"]))} (^java.time.zone.ZoneRules [^java.time.ZoneOffset this50778] (.rules this50778)))
(clojure.core/defn of-hours {:arglists (quote (["int"]))} (^java.time.ZoneOffset [^java.lang.Integer int50779] (. java.time.ZoneOffset ofHours int50779)))
(clojure.core/defn get-id {:arglists (quote (["java.time.ZoneOffset"]))} (^java.lang.String [^java.time.ZoneOffset this50780] (.id this50780)))
(clojure.core/defn normalized {:arglists (quote (["java.time.ZoneOffset"]))} (^java.time.ZoneId [^java.time.ZoneOffset this50781] (.normalized this50781)))
(clojure.core/defn system-default {:arglists (quote ([]))} (^java.time.ZoneId [] (. java.time.ZoneOffset systemDefault)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"] ["java.time.temporal.TemporalAccessor"]))} (^java.lang.Object [G__50783] (. java.time.ZoneOffset from G__50783)))
(clojure.core/defn of-hours-minutes-seconds {:arglists (quote (["int" "int" "int"]))} (^java.time.ZoneOffset [^java.lang.Integer int50784 ^java.lang.Integer int50785 ^java.lang.Integer int50786] (. java.time.ZoneOffset ofHoursMinutesSeconds int50784 int50785 int50786)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [^java.time.ZoneOffset this50787 ^java.time.temporal.TemporalField java-time-temporal-TemporalField50788] (.isSupported this50787 java-time-temporal-TemporalField50788)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.ZoneOffset"]))} (^java.lang.Integer [^java.time.ZoneOffset this50789] (.hashCode this50789)))
(clojure.core/defn get-total-seconds {:arglists (quote (["java.time.ZoneOffset"]))} (^java.lang.Integer [^java.time.ZoneOffset this50790] (.totalSeconds this50790)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.ZoneOffset this50791 ^java.time.temporal.Temporal java-time-temporal-Temporal50792] (.adjustInto this50791 java-time-temporal-Temporal50792)))
(clojure.core/defn of-hours-minutes {:arglists (quote (["int" "int"]))} (^java.time.ZoneOffset [^java.lang.Integer int50793 ^java.lang.Integer int50794] (. java.time.ZoneOffset ofHoursMinutes int50793 int50794)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.ZoneOffset" "java.time.ZoneOffset"] ["java.time.ZoneOffset" "java.lang.Object"]))} (^java.lang.Integer [this50795 G__50796] (.compareTo ^java.time.ZoneOffset this50795 G__50796)))
(clojure.core/defn get {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.ZoneOffset this50797 ^java.time.temporal.TemporalField java-time-temporal-TemporalField50798] (.get this50797 java-time-temporal-TemporalField50798)))
(clojure.core/defn equals {:arglists (quote (["java.time.ZoneOffset" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.ZoneOffset this50799 ^java.lang.Object java-lang-Object50800] (.equals this50799 java-lang-Object50800)))