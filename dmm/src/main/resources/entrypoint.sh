#!/usr/bin/env bash

mkdir -p /opt/app/dmm/tmp

java -Djava.io.tmpdir=/opt/app/dmm/tmp -Djava.security.egd=file:/dev/urandom -jar dmm.jar