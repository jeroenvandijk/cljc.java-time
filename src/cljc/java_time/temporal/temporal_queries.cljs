(ns cljc.java-time.temporal.temporal-queries (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness] [java.time.temporal :refer [TemporalQueries]]))
(clojure.core/defn offset {:arglists (quote ([]))} (^js/JSJoda.TemporalQuery [] (js-invoke java.time.temporal.TemporalQueries "offset")))
(clojure.core/defn precision {:arglists (quote ([]))} (^js/JSJoda.TemporalQuery [] (js-invoke java.time.temporal.TemporalQueries "precision")))
(clojure.core/defn chronology {:arglists (quote ([]))} (^js/JSJoda.TemporalQuery [] (js-invoke java.time.temporal.TemporalQueries "chronology")))
(clojure.core/defn zone-id {:arglists (quote ([]))} (^js/JSJoda.TemporalQuery [] (js-invoke java.time.temporal.TemporalQueries "zoneId")))
(clojure.core/defn zone {:arglists (quote ([]))} (^js/JSJoda.TemporalQuery [] (js-invoke java.time.temporal.TemporalQueries "zone")))
(clojure.core/defn local-date {:arglists (quote ([]))} (^js/JSJoda.TemporalQuery [] (js-invoke java.time.temporal.TemporalQueries "localDate")))
(clojure.core/defn local-time {:arglists (quote ([]))} (^js/JSJoda.TemporalQuery [] (js-invoke java.time.temporal.TemporalQueries "localTime")))
