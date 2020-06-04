if [ -z "${RANCHER_URL}" ]; then
  echo "Must set RANCHER_URL"
  exit 2
fi

HEALTHCHECK_URI="${RANCHER_URL}/ping"

printf "Waiting for local rancher2 to be ready"

until $(curl -k --output /dev/null --silent --head --fail --max-time 2 ${HEALTHCHECK_URI}); do
    printf '.'
    sleep 2
done

echo
