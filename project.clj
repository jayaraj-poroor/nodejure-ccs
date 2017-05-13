(defproject nodejure/ccs "0.1.2-SNAPSHOT"
  :description "Nodejure Clojure Compute Service"
  :url "http://nodejure.org"
  :dependencies [
	[org.clojure/clojure "1.6.0"]
	[org.antlr/antlr4 "4.5"]
	[http-kit "2.1.18"]
	[cheshire "5.4.0"]
	[bultitude "0.2.6"]
  ]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :java-source-paths ["src/grammar" "src/parser/src"]
 )
