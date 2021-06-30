if [ -z "${RANCHER_URL}" ]; then
  echo "Must set RANCHER_URL"
  exit 2
fi

docker ps
docker logs testing_rancher2_1
HEALTHCHECK_URI="${RANCHER_URL}/ping"

printf "Waiting for local rancher2 to be ready"

until curl -k --tlsv1.3 -vvv --fail --max-time 2 "${HEALTHCHECK_URI}"; do
    printf '.'
    printf %s "${HEALTHCHECK_URI}"
    sleep 2
done

echo
