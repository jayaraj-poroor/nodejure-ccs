; Copyright (c) Shelloid Systems LLP. All rights reserved.
; By using this software in any fashion, you are agreeing to be bound by
; the terms of this license.
; You must not remove this notice, or any other, from this software.
 
(ns shelloid.stream.lib
	(:gen-class)
	(:use shelloid.service) 
)

(service streamModified [& urls]
	(do
		(println "streamModified invoked" urls)
		true
	)
)

(service accessTokenUpdated [rec]
	(do
		(println "accessTokenUpdated invoked" rec)
		true
	)
)