(defproject server "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [javax.servlet/servlet-api "2.5"]   ;  Server
                 [ring/ring-core "1.6.2"]            ;  Server
                 [compojure "1.6.0"];                ;  Serve static html
                 [com.walmartlabs/lacinia "0.20.0"]  ;  GraphQL
                 [com.novemberain/monger "3.1.0"]    ;  MongoDB
                 [org.clojure/tools.logging "0.4.0"]];  Logger

  :plugins [[lein-ring "0.12.1"]                    ; lein ring server (start server)
            [lein-dotenv "RELEASE"]]                ; self-explained
  :main ^:skip-aot server.core
  :target-path "target/%s"
  :resource-paths ["../client"]
  :profiles {:uberjar {:aot :all}}
  :ring {:handler server.core/handler})
