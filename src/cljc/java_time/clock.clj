(ns cljc.java-time.clock (:refer-clojure :exclude [get range format min max next name resolve]) (:import [java.time Clock]))
(clojure.core/defn tick {:arglists (quote (["java.time.Clock" "java.time.Duration"]))} (^java.time.Clock [^java.time.Clock java-time-Clock7336 ^java.time.Duration java-time-Duration7337] (. java.time.Clock tick java-time-Clock7336 java-time-Duration7337)))
(clojure.core/defn offset {:arglists (quote (["java.time.Clock" "java.time.Duration"]))} (^java.time.Clock [^java.time.Clock java-time-Clock7338 ^java.time.Duration java-time-Duration7339] (. java.time.Clock offset java-time-Clock7338 java-time-Duration7339)))
(clojure.core/defn system-utc {:arglists (quote ([]))} (^java.time.Clock [] (. java.time.Clock systemUTC)))
(clojure.core/defn system-default-zone {:arglists (quote ([]))} (^java.time.Clock [] (. java.time.Clock systemDefaultZone)))
(clojure.core/defn fixed {:arglists (quote (["java.time.Instant" "java.time.ZoneId"]))} (^java.time.Clock [^java.time.Instant java-time-Instant7340 ^java.time.ZoneId java-time-ZoneId7341] (. java.time.Clock fixed java-time-Instant7340 java-time-ZoneId7341)))
(clojure.core/defn tick-minutes {:arglists (quote (["java.time.ZoneId"]))} (^java.time.Clock [^java.time.ZoneId java-time-ZoneId7342] (. java.time.Clock tickMinutes java-time-ZoneId7342)))
(clojure.core/defn tick-seconds {:arglists (quote (["java.time.ZoneId"]))} (^java.time.Clock [^java.time.ZoneId java-time-ZoneId7343] (. java.time.Clock tickSeconds java-time-ZoneId7343)))
(clojure.core/defn millis {:arglists (quote (["java.time.Clock"]))} (^long [^java.time.Clock this7344] (.millis this7344)))
(clojure.core/defn with-zone {:arglists (quote (["java.time.Clock" "java.time.ZoneId"]))} (^java.time.Clock [^java.time.Clock this7345 ^java.time.ZoneId java-time-ZoneId7346] (.withZone this7345 java-time-ZoneId7346)))
(clojure.core/defn get-zone {:arglists (quote (["java.time.Clock"]))} (^java.time.ZoneId [^java.time.Clock this7347] (.getZone this7347)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.Clock"]))} (^java.lang.Integer [^java.time.Clock this7348] (.hashCode this7348)))
(clojure.core/defn system {:arglists (quote (["java.time.ZoneId"]))} (^java.time.Clock [^java.time.ZoneId java-time-ZoneId7349] (. java.time.Clock system java-time-ZoneId7349)))
(clojure.core/defn instant {:arglists (quote (["java.time.Clock"]))} (^java.time.Instant [^java.time.Clock this7350] (.instant this7350)))
(clojure.core/defn equals {:arglists (quote (["java.time.Clock" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.Clock this7351 ^java.lang.Object java-lang-Object7352] (.equals this7351 java-lang-Object7352)))