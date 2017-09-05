(defproject server "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [javax.servlet/servlet-api "2.5"]
                 [ring/ring-core "1.6.2"]
                 [compojure "1.6.0"]]
  :plugins [[lein-ring "0.12.1"]]
  :main ^:skip-aot server.core
  :target-path "target/%s"
  :resource-paths ["../client"]
  :profiles {:uberjar {:aot :all}}
  :ring {:handler server.core/handler})
